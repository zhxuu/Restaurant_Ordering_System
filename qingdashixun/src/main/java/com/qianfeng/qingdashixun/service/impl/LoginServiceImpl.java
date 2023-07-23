package com.qianfeng.qingdashixun.service.impl;

import com.qianfeng.qingdashixun.mapper.LoginMapper;
import com.qianfeng.qingdashixun.pojo.LoginUser;
import com.qianfeng.qingdashixun.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override

    public Map<String,Object> login(LoginUser user){
        Map<String,Object> map=new HashMap<>();
        List<LoginUser> userList=loginMapper.login(user);
        if(userList.size()>0){
            map.put("isLogin",true);
            map.put("msg","登陆成功");
        }else{
            map.put("isLogin",false);
            map.put("msg","用户名或密码错误，如没有账号，请注册！！");
        }

        return map;
    }

    @Override
    public Map<String, Object> register(LoginUser user) {
        int i = loginMapper.register(user);
        Map<String,Object> map = new HashMap<>();
        if(i>0){
            map.put("isRegister",true);
            map.put("msg","注册成功，跳转页面进行登录");
        }else{
            map.put("isRegister",false);
            map.put("msg","注册失败，请联系管理员");
        }
        return map;
    }
}
