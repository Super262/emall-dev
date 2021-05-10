package com.fengwei.service.impl;

import com.fengwei.enums.ResponseEnum;
import com.fengwei.enums.RoleEnum;
import com.fengwei.mapper.MallUserMapper;
import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private MallUserMapper mallUserMapper;

    @Override
    public ResponseVo<MallUser> register(MallUser user) {
        //username不能重复
        int countByUsername = mallUserMapper.countByUsername(user.getUsername());
        if (countByUsername > 0) {
            return ResponseVo.error(ResponseEnum.USERNAME_EXIST);
        }

        //email不能重复
        int countByEmail = mallUserMapper.countByEmail(user.getEmail());
        if (countByEmail > 0) {
            return ResponseVo.error(ResponseEnum.EMAIL_EXIST);
        }

        user.setRole(RoleEnum.CUSTOMER.getCode());
        //MD5摘要算法(Spring自带)
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8)));

        //写入数据库
        int resultCount = mallUserMapper.insertSelective(user);
        if (resultCount == 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }

        return ResponseVo.success();
    }

    @Override
    public ResponseVo<MallUser> login(String username,String password) {
        MallUser mallUser = mallUserMapper.selectByUsername(username);
        if (mallUser == null) {
            //用户不存在（返回：用户名或密码错误 ）
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        if (!mallUser.getPassword().equalsIgnoreCase(DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)))) {
            //密码错误(返回：用户名或密码错误 )
            return ResponseVo.error(ResponseEnum.USERNAME_OR_PASSWORD_ERROR);
        }

        mallUser.setPassword("");
        return ResponseVo.success(mallUser);
    }
}
