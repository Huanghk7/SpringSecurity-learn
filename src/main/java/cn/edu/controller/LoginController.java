package cn.edu.controller;

import cn.edu.domain.ResponseResult;
import cn.edu.domain.User;
import cn.edu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huanghk
 * @date 2022/11/19 11:22
 * @project SpringSecurity
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(value = "/user/login")
    public ResponseResult login(@RequestBody User user) {
        return loginService.login(user);
    }

    @RequestMapping(value = "/user/logout")
    public ResponseResult logout() {
        return loginService.logout();
    }

}
