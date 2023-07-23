package com.qianfeng.qingdashixun.service;

import com.qianfeng.qingdashixun.pojo.Order;

import java.util.Map;

public interface OrderService {
    Map<String, Object> getOrderList(Order order);

    Map<String, Object> orderUpd(Order order);

    Map<String, Object> getOrderById(Integer id);

    Map<String, Object> orderAdd(Order order);
}
