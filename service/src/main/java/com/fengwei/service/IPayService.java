package com.fengwei.service;

import com.fengwei.pojo.UserPayment;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public interface IPayService {

    /**
     * 创建/发起支付
     */
    PayResponse createPayment(String orderId,BigDecimal amount,BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知处理
     *
     * @param notifyData
     */
    String asyncNotify(String notifyData);

    /**
     * 查询支付记录(通过订单号)
     *
     * @param orderId
     * @return
     */
    UserPayment queryPayment(String orderId);
}
