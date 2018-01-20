package com.springboot.quickstart.service;

import com.springboot.quickstart.pojo.Orders;

public interface OrdersService {

    Orders selectById(Integer id);
}
