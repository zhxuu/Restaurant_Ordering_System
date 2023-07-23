package com.qianfeng.qingdashixun.mapper;

import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import com.qianfeng.qingdashixun.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface OrderMapper {
    public List<Order> getOrderList(Order order);

    int orderUpd(Order order);

    Order getOrderById(Integer id);

    int orderAdd(Order order);
}
