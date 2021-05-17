package com.fengwei.interceptors;

import com.fengwei.consts.MallConst;
import com.fengwei.exceptions.UserLoginException;
import com.fengwei.pojo.MallUser;
import org.slf4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginInterceptor implements HandlerInterceptor {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserLoginInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception {
        log.info("preHandle...");
        MallUser user = (MallUser) request.getSession().getAttribute(MallConst.CURRENT_USER);
        if (user == null) {
            // 用户信息异常
            log.info("user=null");
            throw new UserLoginException();
        }
        // 用户信息正常
        return true;
    }
}