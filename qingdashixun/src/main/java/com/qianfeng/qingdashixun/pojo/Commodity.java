package com.qianfeng.qingdashixun.pojo;

import lombok.Data;

@Data
public class Commodity {
    private int id;
    private String commodityName;
    private String brand;
    private String type;
    private Double price;
    private String img_url;
    private String mdf;//生产日期
    private String exp;//保质期
    private String state;//上架状态
}
