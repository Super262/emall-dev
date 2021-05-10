package com.fengwei.mapper;

import com.fengwei.pojo.UserPayment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserPaymentMapper extends MyMapper<UserPayment> {
    UserPayment selectByOrderNo(@Param("orderNo") Long orderNo);
}