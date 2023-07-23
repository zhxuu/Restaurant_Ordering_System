package com.qianfeng.qingdashixun.controller;

import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import com.qianfeng.qingdashixun.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    private CommodityService commodityService;
    @RequestMapping("/getCommodityList")
    @ResponseBody
    public Map<String,Object> getCommodityList(CommodityVo commodityVo){
        return commodityService.getCommodityList(commodityVo);
    }
    @RequestMapping("/toadd")
    public String toadd(){
        return "commodityAdd";
    }
    @RequestMapping("/commodityAdd")
    @ResponseBody
    public Map<String,Object> commodityAdd(Commodity commodity){
        return commodityService.commodityAdd(commodity);
    }
    @RequestMapping("/toupd")
    public ModelAndView toupd(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("commodityUpd");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @RequestMapping("/getCommodityById")
    @ResponseBody
    public Map<String,Object> getCommodityById(Integer id){
        return commodityService.getCommodityById(id);
    }
    @RequestMapping("/todel")
    public String del(Integer id){
         commodityService.del(id);
         //redirect 重定向 重新设置浏览器中url的路径
        return "redirect:/toIndex";
    }
    @RequestMapping("/commodityUpd")
    @ResponseBody
    public Map<String,Object> commodityUpd(Commodity commodity){
        return commodityService.commodityUpd(commodity);
    }
    @RequestMapping("/getCommodityByType")
    @ResponseBody
    public Map<String,Object> getCommodityByType(String type){
        return commodityService.getCommodityByType(type);
    }
    @RequestMapping("/getCommodityByName")
    @ResponseBody
    public Map<String,Object> getCommodityByName(String commodityName){
        return commodityService.getCommodityByName(commodityName);
    }
    @RequestMapping("/toup")
    public ModelAndView toup(String type){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cusSelect");
        modelAndView.addObject("type",type);
        return modelAndView;
    }
    @RequestMapping("/tocusOrder")
    public ModelAndView tocusOrder(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cusOrder");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
}
