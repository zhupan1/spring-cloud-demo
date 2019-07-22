package com.pan.user.service.controller;

import com.pan.user.service.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Value("${description}")
    private String description;

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        String title = feignService.getByOrderService();
        return "用户服务：" + description + "调用" + title;
    }
}
