package com.pan.user.service.controller;

import com.pan.user.service.entity.TestModel;
import com.pan.user.service.feign.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pan.user.service.service.TestService;

/**
 * @Description
 * @Author PURE
 * @Date 2019年7月23日上午11:25:24
 * @Copyright (c) gome inc Gome Co.,LTD
 */
@RestController
@RequestMapping(value = "/user/")
public class TestController {


	@Autowired
	private TestService testService;

	@Autowired
	private FeignOrderService feignOrderService;

	@GetMapping(value = "test")
	public String test() {
		String title = testService.getTestString();
		String order = feignOrderService.getByOrderService();
		TestModel testModel = testService.getUserInfo();

		return "用户服务：" + title + testModel.toString() + "调用" + order;
	}
}
