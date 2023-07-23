package com.qianfeng.qingdashixun.pojo;

import lombok.Data;

@Data
public class CommodityVo {
    private int id;
    private String commodityName;
    private String brand;
    private String type;
    private Double price_max;
    private Double price_min;

}
