package com.fengwei.controllers;

import com.fengwei.consts.MallConst;
import com.fengwei.forms.UserLoginForm;
import com.fengwei.forms.UserRegisterForm;
import com.fengwei.pojo.MallUser;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.IUserService;
import org.slf4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@RestController
public class UserController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;

    @PostMapping("/user/register")
    public ResponseVo<MallUser> register(@Valid @RequestBody UserRegisterForm userForm) {
        MallUser user = new MallUser();
        BeanUtils.copyProperties(userForm,user);
        //dto
        return userService.register(user);
    }

    @PostMapping("/user/login")
    public ResponseVo<MallUser> login(@Valid @RequestBody UserLoginForm userLoginForm,HttpSession session) {
        ResponseVo<MallUser> userResponseVo = userService.login(userLoginForm.getUsername(),userLoginForm.getPassword());

        //设置Session
        session.setAttribute(MallConst.CURRENT_USER,userResponseVo.getData());
        log.info("/login sessionId={}",session.getId());

        return userResponseVo;
    }

    //session保存在内存里，改进版：token+redis
    @GetMapping("/user")
    public ResponseVo<MallUser> userInfo(HttpSession session) {
        log.info("/user sessionId={}",session.getId());
        MallUser user = (MallUser) session.getAttribute(MallConst.CURRENT_USER);
        return ResponseVo.success(user);
    }

    /**
     * {@link TomcatServletWebServerFactory} getSessionTimeoutInMinutes
     */
    @PostMapping("/user/logout")
    public ResponseVo logout(HttpSession session) {
        log.info("/user/logout sessionId={}",session.getId());
        session.removeAttribute(MallConst.CURRENT_USER);
        return ResponseVo.success();
    }
}
