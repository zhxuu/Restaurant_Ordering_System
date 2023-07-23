package com.qianfeng.qingdashixun.service;

import com.qianfeng.qingdashixun.pojo.LoginUser;

import java.util.Map;

public interface LoginService {
    Map<String, Object> login(LoginUser user);

    Map<String, Object> register(LoginUser user);
}
