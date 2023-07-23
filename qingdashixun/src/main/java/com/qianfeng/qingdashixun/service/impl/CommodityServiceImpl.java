package com.qianfeng.qingdashixun.service.impl;

import com.qianfeng.qingdashixun.mapper.CommodityMapper;
import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import com.qianfeng.qingdashixun.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public Map<String, Object> getCommodityList(CommodityVo commodityVo){
        List<Commodity> list = commodityMapper.getCommodityList(commodityVo);
        Map<String,Object> map = new HashMap<>();
        map.put("data",list);
        return map;
    }

    @Override
    public Map<String, Object> commodityAdd(Commodity commodity) {
        Map<String,Object> map = new HashMap<>();
        int i = commodityMapper.commodityAdd(commodity);
        if(i>0){
            map.put("isAdd",true);
            map.put("msg","新增成功");
        }else{
            map.put("isAdd",false);
            map.put("msg","新增失败");
        }
        return map;
    }

    @Override
    public Map<String, Object> getCommodityById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        Commodity commodity = commodityMapper.getCommodityById(id);
        if(commodity == null){
            map.put("code",500);
        }else{
            map.put("code",200);
            map.put("data",commodity);
        }
        return map;
    }

    @Override
    public void del(Integer id) {
        commodityMapper.del(id);
    }

    @Override
    public Map<String, Object> commodityUpd(Commodity commodity) {
        Map<String,Object> map = new HashMap<>();
        int i = commodityMapper.commodityUpd(commodity);
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
    public Map<String, Object> getCommodityByType(String type) {
        Map<String,Object> map = new HashMap<>();
        List<Commodity> commodity = commodityMapper.getCommodityByType(type);
        if(commodity == null){
            map.put("code",500);
        }else{
            map.put("code",200);
            map.put("data",commodity);
        }
        return map;
    }

    @Override
    public Map<String, Object> getCommodityByName(String commodityName) {
        Map<String,Object> map = new HashMap<>();
        List<Commodity> commodity = commodityMapper.getCommodityByName(commodityName);
        if(commodity == null){
            map.put("code",500);
        }else{
            map.put("code",200);
            map.put("data",commodity);
        }
        return map;
    }
}
