package com.fengwei.controllers;

import com.fengwei.consts.MallConst;
import com.fengwei.forms.CartAddForm;
import com.fengwei.forms.CartUpdateForm;
import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.CartVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
public class CartController {
    @Autowired
    private ICartService cartService;

    // 获取购物车列表
    @GetMapping("/carts")
    public ResponseVo<CartVo> list(HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.getListOfItems(user.getId());
    }

    // 添加商品
    @PostMapping("/carts")
    public ResponseVo<CartVo> add(@Valid @RequestBody CartAddForm cartAddForm,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.addItem(user.getId(),cartAddForm);
    }

    // 更新商品信息
    @PutMapping("/carts/{productId}")
    public ResponseVo<CartVo> update(@PathVariable String productId,@Valid @RequestBody CartUpdateForm form,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.updateItem(user.getId(),productId,form);
    }

    // 删除商品
    @DeleteMapping("/carts/{productId}")
    public ResponseVo<CartVo> delete(@PathVariable String productId,HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.deleteItem(user.getId(),productId);
    }

    // 选中所有商品
    @PutMapping("/carts/selectAll")
    public ResponseVo<CartVo> selectAll(HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.setAllSelected(user.getId());
    }

    // 取消选中所有商品
    @PutMapping("/carts/unSelectAll")
    public ResponseVo<CartVo> unSelectAll(HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.setAllUnselected(user.getId());
    }

    // 求商品总数
    @GetMapping("/carts/products/sum")
    public ResponseVo<Integer> sum(HttpSession session) {
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return cartService.getTotalQuantity(user.getId());
    }
}
