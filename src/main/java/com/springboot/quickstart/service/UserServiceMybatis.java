package com.springboot.quickstart.service;

import com.springboot.quickstart.mapper.UserMapper;
import com.springboot.quickstart.pojo.User;

import java.util.List;

/**
 * class_name: UserServiceMybatis
 * package: com.springboot.quickstart.service
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 16:09
 **/
public interface UserServiceMybatis {

    List<User> selectUser();
}
