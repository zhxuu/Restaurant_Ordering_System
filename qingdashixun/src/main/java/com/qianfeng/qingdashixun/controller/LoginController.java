package com.qianfeng.qingdashixun.controller;

import com.qianfeng.qingdashixun.pojo.LoginUser;
import com.qianfeng.qingdashixun.service.LoginService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

///spring 分层：
//控制层（controller），逻辑层（service），持久层（mapper）
//控制层：与前端最近的一层，接受前端发送的请求，返回后端数据
//逻辑层（service）：处理代码逻辑
//持久层（mapper）：与数据库交互层
//@Controller是控制层的标识，项目启动时springboot会扫描各个模块的注解，由此区分各个分层
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> login(LoginUser user){
        return loginService.login(user);
    }
    @RequestMapping("/register")
    @ResponseBody
    public Map<String,Object> register(LoginUser user){
        return loginService.register(user);
    }
}
