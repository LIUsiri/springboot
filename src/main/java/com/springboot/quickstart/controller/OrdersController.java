package com.springboot.quickstart.controller;

import com.springboot.quickstart.pojo.Orders;
import com.springboot.quickstart.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * class_name: OrdersController
 * package: com.springboot.quickstart.controller
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 19:44
 **/

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/orders/{id}")
    @ResponseBody
    public Orders getOrders(@PathVariable Integer id){

        return ordersService.selectById(id);
    }
}
