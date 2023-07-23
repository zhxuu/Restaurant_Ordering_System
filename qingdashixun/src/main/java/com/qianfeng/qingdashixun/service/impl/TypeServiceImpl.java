package com.qianfeng.qingdashixun.service.impl;

import com.qianfeng.qingdashixun.mapper.TypeMapper;
import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.TbType;
import com.qianfeng.qingdashixun.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeMapper typeMapper;
    @Override
    public Map<String, Object> getTypeList() {
        HashMap<String, Object> map = new HashMap<>();
        List<TbType> types = typeMapper.getTypeList();
        map.put("data",types);
        return map;
    }

    @Override
    public Map<String, Object> getType(TbType type) {
        HashMap<String, Object> map = new HashMap<>();
        List<TbType> types = typeMapper.getType(type);
        map.put("data",types);
        return map;
    }

    @Override
    public Map<String, Object> typeAdd(TbType type) {
        Map<String,Object> map = new HashMap<>();
        int i = typeMapper.typeAdd(type);
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
    public Map<String, Object> getTypeById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        TbType type = typeMapper.getTypeById(id);
        if(type == null){
            map.put("code",500);
        }else{
            map.put("code",200);
            map.put("data",type);
        }
        return map;
    }

    @Override
    public void del(Integer id) {
        typeMapper.del(id);
    }

    @Override
    public Map<String, Object> typeUpd(TbType type) {
        Map<String,Object> map = new HashMap<>();
        int i = typeMapper.typeUpd(type);
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
}
