package com.springboot.quickstart.mapper;

import com.springboot.quickstart.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * class_name: UserMapper
 * package: com.springboot.quickstart.mapper
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 16:02
 **/

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> selectUser();
}
