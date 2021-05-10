package com.fengwei.controllers;

import com.fengwei.pojo.UserPayment;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IPayService;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
public class PayController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(PayController.class);
    @Autowired
    private IPayService payService;

    @Autowired
    private WxPayConfig wxPayConfig;

    @GetMapping("/pay/create")
    public ResponseVo<String> create(@RequestParam("orderId") String orderId,@RequestParam("amount") BigDecimal amount,@RequestParam("payType") BestPayTypeEnum bestPayTypeEnum) {
        PayResponse response = payService.createPayment(orderId,amount,bestPayTypeEnum);
        return ResponseVo.success(response.getCodeUrl());
    }

    @PostMapping("/pay/notify")
    public String asyncNotify(@RequestBody String notifyData) {
        return payService.asyncNotify(notifyData);
    }

    @GetMapping("/pay/queryByOrderId")
    public UserPayment queryByOrderId(@RequestParam String orderId) {
        log.info("查询支付记录...");
        return payService.queryPayment(orderId);
    }
}