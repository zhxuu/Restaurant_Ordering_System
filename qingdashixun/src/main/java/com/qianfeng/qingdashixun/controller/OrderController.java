package com.qianfeng.qingdashixun.controller;

import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.Order;

import com.qianfeng.qingdashixun.service.OrderService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/getOrderList")
    @ResponseBody
    public Map<String,Object> getOrderList(Order order){
        return orderService.getOrderList(order);
    }
    @RequestMapping("/toupd")
    public ModelAndView toupd(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("orderUpd");
        modelAndView.addObject("id",id);
        return modelAndView;
    }
    @RequestMapping("/orderUpd")
    @ResponseBody
    public Map<String,Object> orderUpd(Order order){
        return orderService.orderUpd(order);
    }
    @RequestMapping("/getOrderById")
    @ResponseBody
    public Map<String,Object> getOrderById(Integer id){
        return orderService.getOrderById(id);
    }
    @RequestMapping("/toadd")
    public String toadd(){
        return "orderAdd";
    }
    @RequestMapping("/orderAdd")
    @ResponseBody
    public Map<String,Object> orderAdd(Order order){
        return orderService.orderAdd(order);
    }
}
