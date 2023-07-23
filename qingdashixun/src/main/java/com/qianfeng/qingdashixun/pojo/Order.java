package com.qianfeng.qingdashixun.pojo;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String orderNumber;
    private String commodityName;
    private String time;
    private Integer count;
    private String address;
    private String customer;

}
