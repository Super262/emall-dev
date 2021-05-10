package com.fengwei.mapper;

import com.fengwei.pojo.UserOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserOrderMapper extends MyMapper<UserOrder> {
    List<UserOrder> selectByUid(@Param("uid") Integer uid);

    UserOrder selectByOrderNo(@Param("orderNo") Long orderNo);
}