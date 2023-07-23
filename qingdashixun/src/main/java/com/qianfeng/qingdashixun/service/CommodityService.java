package com.qianfeng.qingdashixun.service;

import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import com.qianfeng.qingdashixun.service.impl.CommodityServiceImpl;

import java.util.Map;

public interface CommodityService {
    Map<String, Object> getCommodityList(CommodityVo commodityVo);

    Map<String, Object> commodityAdd(Commodity commodity);

    Map<String, Object> getCommodityById(Integer id);

    void del(Integer id);

    Map<String, Object> commodityUpd(Commodity commodity);

    Map<String, Object> getCommodityByType(String type);

    Map<String, Object> getCommodityByName(String commodityName);
}
