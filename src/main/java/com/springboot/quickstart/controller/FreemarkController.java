package com.springboot.quickstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * class_name: FreemarkController
 * package: com.springboot.quickstart.controller
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 15:31
 **/

@Controller
public class FreemarkController {


    @RequestMapping("hello")
    public String hello(Model model){

        model.addAttribute("hello","hello SpringBoot");

        return "hello";
    }
}
