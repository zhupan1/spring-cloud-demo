package com.pan.order.service.controller;

import com.pan.model.service.entity.OrderModel;
import com.pan.order.service.feign.FeignUserService;
import com.pan.order.service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Pan P Zhu
 * @Date: 22/07/2019 17:13
 * @Description:
 */
@RestController
@RequestMapping(value = "/order/")
public class OrderController {


    @Value("${description}")
    private String description;

    @Autowired
    private OrderService orderService;


    @GetMapping(value = "test")
    public String test() {
        OrderModel orderModel = orderService.getOrderInfo();
        return "订单服务：" + orderModel.toString() + description;
    }
}
