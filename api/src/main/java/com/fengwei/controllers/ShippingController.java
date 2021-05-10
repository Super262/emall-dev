package com.fengwei.controllers;

import com.fengwei.consts.MallConst;
import com.fengwei.forms.ShippingForm;
import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
public class ShippingController {

    @Autowired
    private IShippingService shippingService;

    @PostMapping("/shippings")
    public ResponseVo add(@Valid @RequestBody ShippingForm form,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.addShipping(user.getId(),form);
    }

    @DeleteMapping("/shippings/{shippingId}")
    public ResponseVo delete(@PathVariable Integer shippingId,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.deleteShipping(user.getId(),shippingId);
    }

    @PutMapping("/shippings/{shippingId}")
    public ResponseVo update(@PathVariable Integer shippingId,@Valid @RequestBody ShippingForm form,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.updateShipping(user.getId(),shippingId,form);
    }

    @GetMapping("/shippings")
    public ResponseVo list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,@RequestParam(required = false, defaultValue = "10") Integer pageSize,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.getListOfShippings(user.getId(),pageNum,pageSize);
    }
}
