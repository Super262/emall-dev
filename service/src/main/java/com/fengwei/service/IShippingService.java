package com.fengwei.service;

import com.fengwei.forms.ShippingForm;
import com.fengwei.pojo.vo.ResponseVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface IShippingService {

    ResponseVo<Map<String, Integer>> addShipping(Integer uid,ShippingForm form);

    ResponseVo deleteShipping(Integer uid,Integer shippingId);

    ResponseVo updateShipping(Integer uid,Integer shippingId,ShippingForm form);

    ResponseVo<PageInfo> getListOfShippings(Integer uid,Integer pageNum,Integer pageSize);
}
