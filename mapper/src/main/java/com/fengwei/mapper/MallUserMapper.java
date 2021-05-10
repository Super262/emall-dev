package com.fengwei.mapper;

import com.fengwei.pojo.MallUser;
import org.apache.ibatis.annotations.Param;

public interface MallUserMapper extends MyMapper<MallUser> {
    int countByUsername(@Param("username") String username);

    int countByEmail(@Param("email") String email);

    MallUser selectByUsername(@Param("username") String username);
}