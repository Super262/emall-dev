package com.fengwei.service;


import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.ResponseVo;

public interface IUserService {

    /**
     * 注册
     */
    ResponseVo<MallUser> register(MallUser user);

    /**
     * 登录
     */
    ResponseVo<MallUser> login(String username,String password);
}
