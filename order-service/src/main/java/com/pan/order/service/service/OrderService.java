package com.pan.order.service.service;

import com.pan.model.service.entity.OrderModel;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 16:59
 * @Description:
 */
public interface OrderService {


    /**
     * 获取订单信息
     * @return
     */
    OrderModel getOrderInfo();
}
