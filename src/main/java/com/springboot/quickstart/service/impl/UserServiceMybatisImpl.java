package com.springboot.quickstart.service.impl;

import com.springboot.quickstart.mapper.UserMapper;
import com.springboot.quickstart.pojo.User;
import com.springboot.quickstart.service.UserServiceMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceMybatisImpl implements UserServiceMybatis {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {

        return userMapper.selectUser();
    }
}
