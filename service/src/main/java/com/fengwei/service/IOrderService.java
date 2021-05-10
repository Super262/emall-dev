package com.fengwei.service;

import com.fengwei.pojo.vo.OrderVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.github.pagehelper.PageInfo;

public interface IOrderService {

    public ResponseVo<OrderVo> createOrder(Integer uid,Integer shippingId);

    public ResponseVo<PageInfo> getListOfOrders(Integer uid,Integer pageNum,Integer pageSize);

    public ResponseVo<OrderVo> getDetailOfOrder(Integer uid,Long orderNo);

    public ResponseVo cancelOrder(Integer uid,Long orderNo);

    public void setStatusPaid(Long orderNo);
}
