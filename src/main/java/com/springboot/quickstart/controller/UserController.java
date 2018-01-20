package com.springboot.quickstart.controller;

import com.springboot.quickstart.pojo.User;
import com.springboot.quickstart.service.UserServiceMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * class_name: UserController
 * package: com.springboot.quickstart.controller
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 16:13
 **/
@Controller
public class UserController {

    @Autowired
    private UserServiceMybatis userServiceMybatis;

    @RequestMapping("/query/list")
    @ResponseBody
    public List<User> slectUsr(Model model){

        List<User> list = userServiceMybatis.selectUser();

        return list;
    }
}
