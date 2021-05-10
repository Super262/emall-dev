package com.fengwei.service;

import com.fengwei.forms.ShippingForm;
import com.fengwei.pojo.vo.ResponseVo;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface IShippingService {

    public ResponseVo<Map<String, Integer>> addShipping(Integer uid,ShippingForm form);

    public ResponseVo deleteShipping(Integer uid,Integer shippingId);

    public ResponseVo updateShipping(Integer uid,Integer shippingId,ShippingForm form);

    public ResponseVo<PageInfo> getListOfShippings(Integer uid,Integer pageNum,Integer pageSize);
}
