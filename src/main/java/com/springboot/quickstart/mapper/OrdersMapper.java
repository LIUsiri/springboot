package com.springboot.quickstart.mapper;

import com.springboot.quickstart.pojo.Orders;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface OrdersMapper extends Mapper<Orders> {

}
