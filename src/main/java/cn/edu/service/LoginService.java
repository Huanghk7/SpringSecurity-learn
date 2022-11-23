package cn.edu.service;

import cn.edu.domain.ResponseResult;
import cn.edu.domain.User;

public interface LoginService {

    ResponseResult login(User user);

    ResponseResult logout();
}
