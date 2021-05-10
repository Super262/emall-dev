package com.fengwei.listeners;

import com.fengwei.pojo.UserPayment;
import com.fengwei.service.IOrderService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "payNotify")
public class PayMsgListener {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(PayMsgListener.class);
    @Autowired
    private IOrderService orderService;

    @RabbitHandler
    public void process(String msg) {
        log.info("【接收到消息】=> {}",msg);

        UserPayment payInfo = new Gson().fromJson(msg,UserPayment.class);
        if (payInfo.getPlatformStatus().equals("SUCCESS")) {
            //修改订单里的状态
            orderService.setStatusPaid(payInfo.getOrderNo());
        }
    }
}
