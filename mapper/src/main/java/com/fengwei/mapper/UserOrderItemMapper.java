package com.fengwei.mapper;

import com.fengwei.pojo.UserOrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

@Mapper
public interface UserOrderItemMapper extends MyMapper<UserOrderItem> {
    List<UserOrderItem> selectByOrderNoSet(@Param("orderNoSet") Set<Long> orderNoSet);
}