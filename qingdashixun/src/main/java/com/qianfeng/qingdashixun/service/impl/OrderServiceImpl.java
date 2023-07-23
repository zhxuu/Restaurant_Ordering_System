package com.qianfeng.qingdashixun.service.impl;

import com.qianfeng.qingdashixun.mapper.CommodityMapper;
import com.qianfeng.qingdashixun.mapper.OrderMapper;
import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import com.qianfeng.qingdashixun.pojo.Order;
import com.qianfeng.qingdashixun.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Override
    public Map<String, Object> getOrderList(Order order) {
        List<Order> list = orderMapper.getOrderList(order);
        Map<String,Object> map = new HashMap<>();
        map.put("data",list);
        return map;
    }

    @Override
    public Map<String, Object> orderUpd(Order order) {
        Map<String,Object> map = new HashMap<>();
        int i = orderMapper.orderUpd(order);
        if(i>0){
            map.put("code",200);
            map.put("isupd",true);
            map.put("msg","修改成功，跳转至页表");
        }else{
            map.put("code",500);
            map.put("isupd",false);
            map.put("msg","修改失败，请重新修改");
        }
        return map;
    }

    @Override
    public Map<String, Object> getOrderById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        Order order = orderMapper.getOrderById(id);
        if(order == null){
            map.put("code",500);
        }else{
            map.put("code",200);
            map.put("data",order);
        }
        return map;
    }

    @Override
    public Map<String, Object> orderAdd(Order order) {
        Map<String,Object> map = new HashMap<>();
        int i = orderMapper.orderAdd(order);
        if(i>0){
            map.put("isAdd",true);
            map.put("msg","新增成功");
        }else{
            map.put("isAdd",false);
            map.put("msg","新增失败");
        }
        return map;
    }
}
