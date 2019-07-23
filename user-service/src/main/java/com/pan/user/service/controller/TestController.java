package com.pan.user.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pan.user.service.service.FeignService;

/**
 * @Description
 * @Author PURE
 * @Date 2019年7月23日上午11:25:24
 * @Copyright (c) gome inc Gome Co.,LTD
 */
@RestController
@RequestMapping(value = "user")
public class TestController {

	@Value("${description}")
	private String description;

	@Autowired
	private FeignService feignService;

	@GetMapping(value = "test")
	public String test() {
		String title = feignService.getByOrderService();
		return "用户服务：" + description + "调用" + title;
	}
}
