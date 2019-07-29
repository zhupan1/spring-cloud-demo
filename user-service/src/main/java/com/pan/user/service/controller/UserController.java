package com.pan.user.service.controller;

import com.pan.model.service.entity.UserModel;
import com.pan.user.service.feign.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pan.user.service.service.UserService;

/**
 * @Description
 * @Author PURE
 * @Date 2019年7月23日上午11:25:24
 * @Copyright (c) gome inc Gome Co.,LTD
 */
@RestController
@RequestMapping(value = "/user/")
public class UserController {


	@Value(value = "${description}")
	private String description;


	@Autowired
	private UserService userService;

	@Autowired
	private FeignOrderService feignOrderService;



	@GetMapping(value = "test")
	public String test() {
		// 获取用户信息
		UserModel userModel = userService.getUserInfo();
		// 调用订单服务
		String order = feignOrderService.getByOrderService();
		return "用户服务：" + description + userModel.toString() + "调用" + order;
	}
}
