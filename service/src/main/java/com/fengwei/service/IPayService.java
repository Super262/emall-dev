package com.fengwei.service;

import com.fengwei.pojo.UserPayment;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;

import java.math.BigDecimal;

public interface IPayService {

    /**
     * 创建/发起支付
     */
    public PayResponse createPayment(String orderId,BigDecimal amount,BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知处理
     *
     * @param notifyData
     */
    public String asyncNotify(String notifyData);

    /**
     * 查询支付记录(通过订单号)
     *
     * @param orderId
     * @return
     */
    public UserPayment queryPayment(String orderId);
}
