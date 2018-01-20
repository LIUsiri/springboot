package com.springboot.quickstart.service.impl;

import com.springboot.quickstart.mapper.OrdersMapper;
import com.springboot.quickstart.pojo.Orders;
import com.springboot.quickstart.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * class_name: OrdersServiceImpl
 * package: com.springboot.quickstart.service.impl
 * describe: TODO
 * @author: Liuxianglong
 * @date: 2018/1/20
 * creat_time: 18:09
 **/

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public Orders selectById(Integer id) {


        Orders orders=new Orders();
        orders.setId(id);
        return ordersMapper.selectOne(orders);
    }
}
