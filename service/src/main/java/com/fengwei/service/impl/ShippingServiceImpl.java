package com.fengwei.service.impl;

import com.fengwei.enums.ResponseEnum;
import com.fengwei.forms.ShippingForm;
import com.fengwei.mapper.UserShippingMapper;
import com.fengwei.pojo.UserShipping;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IShippingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShippingServiceImpl implements IShippingService {

    @Autowired
    private UserShippingMapper userShippingMapper;

    @Override
    public ResponseVo<Map<String, Integer>> addShipping(Integer uid,ShippingForm form) {
        UserShipping shipping = new UserShipping();
        BeanUtils.copyProperties(form,shipping);
        shipping.setUserId(uid);
        int row = userShippingMapper.insertSelective(shipping);
        if (row == 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("shippingId",shipping.getId());
        return ResponseVo.success(map);
    }

    @Override
    public ResponseVo deleteShipping(Integer uid,Integer shippingId) {
        int row = userShippingMapper.deleteByIdAndUid(uid,shippingId);
        if (row == 0) {
            return ResponseVo.error(ResponseEnum.DELETE_SHIPPING_FAIL);
        }
        return ResponseVo.success();
    }

    @Override
    public ResponseVo updateShipping(Integer uid,Integer shippingId,ShippingForm form) {
        UserShipping shipping = new UserShipping();
        BeanUtils.copyProperties(form,shipping);
        shipping.setUserId(uid);
        shipping.setId(shippingId);
        int row = userShippingMapper.updateByPrimaryKeySelective(shipping);
        if (row == 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }
        return ResponseVo.success();
    }

    @Override
    public ResponseVo<PageInfo> getListOfShippings(Integer uid,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserShipping> shippings = userShippingMapper.selectByUid(uid);
        PageInfo pageInfo = new PageInfo(shippings);
        return ResponseVo.success(pageInfo);
    }
}
