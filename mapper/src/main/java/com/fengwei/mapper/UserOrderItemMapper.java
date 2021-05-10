package com.fengwei.mapper;

import com.fengwei.pojo.UserOrderItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface UserOrderItemMapper extends MyMapper<UserOrderItem> {
    List<UserOrderItem> selectByOrderNoSet(@Param("orderNoSet") Set<Long> orderNoSet);
}