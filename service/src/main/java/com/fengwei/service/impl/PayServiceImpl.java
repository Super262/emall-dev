package com.fengwei.service.impl;

import com.fengwei.enums.PayPlatformEnum;
import com.fengwei.mapper.UserPaymentMapper;
import com.fengwei.pojo.UserPayment;
import com.fengwei.service.IPayService;
import com.google.gson.Gson;
import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.enums.OrderStatusEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.BestPayService;
import org.slf4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PayServiceImpl implements IPayService {

    private final static String QUEUE_PAY_NOTIFY = "payNotify";

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(PayServiceImpl.class);

    @Autowired
    private BestPayService bestPayService;

    @Autowired
    private UserPaymentMapper userPaymentMapper;

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 创建/发起支付
     */
    @Override
    public PayResponse createPayment(String orderId,BigDecimal amount,BestPayTypeEnum bestPayTypeEnum) {
        //写入数据库
        UserPayment payInfo = new UserPayment(Long.parseLong(orderId),PayPlatformEnum.getByBestPayTypeEnum(bestPayTypeEnum).getCode(),OrderStatusEnum.NOTPAY.name(),amount);
        userPaymentMapper.insertSelective(payInfo);

        PayRequest request = new PayRequest();
        request.setOrderName("5911079-最好的支付sdk");
        request.setOrderId(orderId);
        request.setOrderAmount(amount.doubleValue());
        request.setPayTypeEnum(bestPayTypeEnum);

        PayResponse response = bestPayService.pay(request);
        log.info("发起支付 response={}",response);

        return response;
    }

    /**
     * 异步通知处理
     */
    @Override
    public String asyncNotify(String notifyData) {
        //1. 签名检验
        PayResponse payResponse = bestPayService.asyncNotify(notifyData);
        log.info("异步通知 response={}",payResponse);

        //2. 金额校验（从数据库查订单）
        //比较严重（正常情况下是不会发生的）发出告警：钉钉、短信
        UserPayment payInfo = userPaymentMapper.selectByOrderNo(Long.parseLong(payResponse.getOrderId()));
        if (payInfo == null) {
            //告警
            throw new RuntimeException("通过orderNo查询到的结果是null");
        }
        //如果订单支付状态不是"已支付"
        if (!payInfo.getPlatformStatus().equals(OrderStatusEnum.SUCCESS.name())) {
            //Double类型比较大小，精度。1.00  1.0
            if (payInfo.getPaymentAmount().compareTo(BigDecimal.valueOf(payResponse.getOrderAmount())) != 0) {
                //告警
                throw new RuntimeException("异步通知中的金额和数据库里的不一致，orderNo=" + payResponse.getOrderId());
            }

            //3. 修改订单支付状态
            payInfo.setPlatformStatus(OrderStatusEnum.SUCCESS.name());
            payInfo.setPlatformNumber(payResponse.getOutTradeNo());
            userPaymentMapper.updateByPrimaryKeySelective(payInfo);
        }

        //TODO pay发送MQ消息，mall接受MQ消息
        amqpTemplate.convertAndSend(QUEUE_PAY_NOTIFY,new Gson().toJson(payInfo));

        if (payResponse.getPayPlatformEnum() == BestPayPlatformEnum.WX) {
            //4. 告诉微信不要再通知了
            return "<xml>\n" + "  <return_code><![CDATA[SUCCESS]]></return_code>\n" + "  <return_msg><![CDATA[OK]]></return_msg>\n" + "</xml>";
        } else if (payResponse.getPayPlatformEnum() == BestPayPlatformEnum.ALIPAY) {
            return "success";
        }

        throw new RuntimeException("异步通知中错误的支付平台");
    }

    @Override
    public UserPayment queryPayment(String orderId) {
        return userPaymentMapper.selectByOrderNo(Long.parseLong(orderId));
    }
}
