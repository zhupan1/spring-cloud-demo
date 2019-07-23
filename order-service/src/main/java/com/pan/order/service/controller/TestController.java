package com.pan.order.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Pan P Zhu
 * @Date: 22/07/2019 17:13
 * @Description:
 */
@RestController
public class TestController {

    @Value("${project.description}")
    private String description;


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String test() {
        return description;
    }
}
