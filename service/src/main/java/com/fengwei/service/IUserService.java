package com.fengwei.service;


import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.ResponseVo;

public interface IUserService {

    /**
     * 注册
     */
    public ResponseVo<MallUser> register(MallUser user);

    /**
     * 登录
     */
    public ResponseVo<MallUser> login(String username,String password);
}
