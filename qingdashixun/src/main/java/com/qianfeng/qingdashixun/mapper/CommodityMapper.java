package com.qianfeng.qingdashixun.mapper;

import com.qianfeng.qingdashixun.pojo.Commodity;
import com.qianfeng.qingdashixun.pojo.CommodityVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {
    public List<Commodity> getCommodityList(CommodityVo commodityVo);

    int commodityAdd(Commodity commodity);

    Commodity getCommodityById(Integer id);

    void del(Integer id);

    int commodityUpd(Commodity commodity);

    List<Commodity> getCommodityByType(String type);

    List<Commodity> getCommodityByName(String commodityName);
}
