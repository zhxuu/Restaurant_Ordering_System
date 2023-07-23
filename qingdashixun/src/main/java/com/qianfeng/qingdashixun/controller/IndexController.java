package com.qianfeng.qingdashixun.controller;

import com.qianfeng.qingdashixun.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller
public class IndexController {
    //前端发送的请求
    @Autowired
    UploadService uploadService;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "欢迎来到SpringBoot的世界";
    }
//    ResponseBody返回的是数据
    //不带ResponseBody 返回页面名称
    @RequestMapping("/")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/toIndex")
    public String toindex(){
        return "index";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
    @RequestMapping("/fileUpload")
    @ResponseBody
    public Map<String,Object> fileUpload(MultipartFile file){
        return uploadService.fileUpload(file);
    }
    @RequestMapping("/toOrder")
    public String toOrder(){
        return "order";
    }
    @RequestMapping("/toType")
    public String toType(){
        return "type";
    }
    @RequestMapping("/toCustomer")
    public String toCustomer(){
        return "customer";
    }
    @RequestMapping("/tocusSelect")
    public String tocusSelect(){
        return "cusSelect";
    }

}
