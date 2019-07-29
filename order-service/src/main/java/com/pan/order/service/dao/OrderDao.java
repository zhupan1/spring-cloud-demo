package com.pan.order.service.dao;

import com.pan.model.service.entity.OrderModel;

/**
 * @Author: Pan P Zhu
 * @Date: 29/07/2019 17:34
 * @Description:
 */
public interface OrderDao {


    /**
     * 获取订单信息
     * @return
     */
    OrderModel getOrderInfo();

}
