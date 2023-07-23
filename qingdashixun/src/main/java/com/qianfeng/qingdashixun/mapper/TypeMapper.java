package com.qianfeng.qingdashixun.mapper;

import com.qianfeng.qingdashixun.pojo.TbType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {
    List<TbType> getTypeList();
    List<TbType> getType(TbType type);

    int typeAdd(TbType type);

    TbType getTypeById(Integer id);

    void del(Integer id);

    int typeUpd(TbType type);
}
