package com.qianfeng.qingdashixun.controller;

import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import com.qianfeng.qingdashixun.pojo.TbType;
import com.qianfeng.qingdashixun.service.CommodityService;
import com.qianfeng.qingdashixun.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private TypeService typeService;


    @RequestMapping("/getTypeList")
    @ResponseBody
    public Map<String,Object> getTypeList(){
            return typeService.getTypeList();
    }
    @RequestMapping("/getType")
    @ResponseBody
    public Map<String,Object> getType(TbType type){
        return typeService.getType(type);
    }

    @RequestMapping("/toadd")
    public String toadd(){
        return "typeAdd";
    }
    @RequestMapping("/typeAdd")
    @ResponseBody
    public Map<String,Object> typeAdd(TbType type){
        return typeService.typeAdd(type);
    }
    @RequestMapping("/toupd")
    public ModelAndView toupd(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("typeUpd");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @RequestMapping("/getTypeById")
    @ResponseBody
    public Map<String,Object> getTypeById(Integer id){
        return typeService.getTypeById(id);
    }
    @RequestMapping("/todel")
    public String del(Integer id){
        typeService.del(id);
        //redirect 重定向 重新设置浏览器中url的路径
        return "redirect:/toType";
    }
    @RequestMapping("/typeUpd")
    @ResponseBody
    public Map<String,Object> typeUpd(TbType type){
        return typeService.typeUpd(type);
    }
}
