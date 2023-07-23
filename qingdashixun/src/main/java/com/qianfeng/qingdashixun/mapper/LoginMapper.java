package com.qianfeng.qingdashixun.mapper;

import com.qianfeng.qingdashixun.pojo.LoginUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    List<LoginUser> login(LoginUser user);

    int register(LoginUser user);
}
