package com.fengwei.mapper;

import com.fengwei.pojo.UserShipping;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Set;

@Mapper
public interface UserShippingMapper extends MyMapper<UserShipping> {

    int deleteByIdAndUid(@Param("uid") Integer uid,@Param("shippingId") Integer shippingId);

    List<UserShipping> selectByUid(@Param("uid") Integer uid);

    UserShipping selectByUidAndShippingId(@Param("uid") Integer uid,@Param("shippingId") Integer shippingId);

    List<UserShipping> selectByIdSet(@Param("idSet") Set<Integer> idSet);
}