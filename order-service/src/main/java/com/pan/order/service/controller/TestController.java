package com.pan.order.service.controller;

import com.pan.order.service.feign.FeignUserService;
import com.pan.order.service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private FeignUserService feignUserService;

    @GetMapping(value = "test")
    public String test() {
        String title = testService.getTestString();
        String user = feignUserService.expose();
        return "用户服务：" + user + "调用" + title;
    }
}
