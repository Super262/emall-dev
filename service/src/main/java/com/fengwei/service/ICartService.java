package com.fengwei.service;


import com.fengwei.forms.CartAddForm;
import com.fengwei.forms.CartUpdateForm;
import com.fengwei.pojo.CartItem;
import com.fengwei.pojo.vo.CartVo;
import com.fengwei.pojo.vo.ResponseVo;

import java.util.List;

public interface ICartService {

    ResponseVo<CartVo> addItem(Integer uid,CartAddForm form);

    ResponseVo<CartVo> getListOfItems(Integer uid);

    ResponseVo<CartVo> updateItem(Integer uid,Integer productId,CartUpdateForm form);

    ResponseVo<CartVo> deleteItem(Integer uid,Integer productId);

    ResponseVo<CartVo> setAllSelected(Integer uid);

    ResponseVo<CartVo> setAllUnselected(Integer uid);

    ResponseVo<Integer> getTotalQuantity(Integer uid);

    List<CartItem> getCartOfUser(Integer uid);
}
