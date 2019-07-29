package com.pan.order.service.service.impl;

import com.pan.model.service.entity.OrderModel;
import com.pan.order.service.dao.OrderDao;
import com.pan.order.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:08
 * @Description: 实现类
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderDao orderDao;


    @Override
    public OrderModel getOrderInfo() {
        return orderDao.getOrderInfo();
    }
}
