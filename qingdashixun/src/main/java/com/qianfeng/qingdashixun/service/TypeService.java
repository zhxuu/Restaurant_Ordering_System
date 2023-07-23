package com.qianfeng.qingdashixun.service;

import com.qianfeng.qingdashixun.pojo.TbType;

import java.util.Map;

public interface TypeService {


    Map<String, Object> typeAdd(TbType type);

    Map<String, Object> getTypeById(Integer id);

    void del(Integer id);

    Map<String, Object> typeUpd(TbType type);

    Map<String, Object> getTypeList();
    Map<String, Object> getType(TbType type);
}
