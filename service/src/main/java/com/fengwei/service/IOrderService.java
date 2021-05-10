package com.fengwei.service;

import com.fengwei.pojo.vo.OrderVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

public interface IOrderService {

    ResponseVo<OrderVo> createOrder(Integer uid,Integer shippingId);

    ResponseVo<PageInfo> getListOfOrders(Integer uid,Integer pageNum,Integer pageSize);

    ResponseVo<OrderVo> getDetailOfOrder(Integer uid,Long orderNo);

    ResponseVo cancelOrder(Integer uid,Long orderNo);

    void setStatusPaid(Long orderNo);
}
