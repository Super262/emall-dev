package com.fengwei.service;


import com.fengwei.forms.CartAddForm;
import com.fengwei.forms.CartUpdateForm;
import com.fengwei.pojo.CartItem;
import com.fengwei.pojo.vo.CartVo;
import com.fengwei.pojo.vo.ResponseVo;

import java.util.List;

public interface ICartService {

    public ResponseVo<CartVo> addItem(Integer uid,CartAddForm form);

    public ResponseVo<CartVo> getListOfItems(Integer uid);

    public ResponseVo<CartVo> updateItem(Integer uid,Integer productId,CartUpdateForm form);

    public ResponseVo<CartVo> deleteItem(Integer uid,Integer productId);

    public ResponseVo<CartVo> setAllSelected(Integer uid);

    public ResponseVo<CartVo> setAllUnselected(Integer uid);

    public ResponseVo<Integer> getTotalQuantity(Integer uid);

    public List<CartItem> getCartOfUser(Integer uid);
}
