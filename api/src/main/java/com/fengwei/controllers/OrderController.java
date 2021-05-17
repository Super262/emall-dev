package com.fengwei.controllers;

import com.fengwei.consts.MallConst;
import com.fengwei.forms.OrderCreateForm;
import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.OrderVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
public class OrderController {

    @Autowired
    private IOrderService orderService;

    // 创建订单
    @PostMapping("/orders")
    public ResponseVo<OrderVo> create(@Valid @RequestBody OrderCreateForm form,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return orderService.createOrder(user.getId(),form.getShippingId());
    }

    // 获取订单列表
    @GetMapping("/orders")
    public ResponseVo<PageInfo> list(@RequestParam Integer pageNum,@RequestParam Integer pageSize,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return orderService.getListOfOrders(user.getId(),pageNum,pageSize);
    }

    // 获取订单详情
    @GetMapping("/orders/{orderNo}")
    public ResponseVo<OrderVo> detail(@PathVariable Long orderNo,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return orderService.getDetailOfOrder(user.getId(),orderNo);
    }

    // ，取消订单
    @PutMapping("/orders/{orderNo}")
    public ResponseVo cancel(@PathVariable Long orderNo,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return orderService.cancelOrder(user.getId(),orderNo);
    }
}