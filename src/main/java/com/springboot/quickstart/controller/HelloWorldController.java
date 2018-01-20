package com.springboot.quickstart.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class_name: HelloWorldController
 * package: com.springboot.quickstart.controller
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 15:18
 **/

@RestController
public class HelloWorldController {

    @RequestMapping("info")
    public String info(){

        return "HelloWorld!";
    }



}
