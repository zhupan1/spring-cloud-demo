package com.pan.user.service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Pan P Zhu
 * @Date: 22/07/2019 17:17
 * @Description:
 */
@FeignClient(value = "${feign.orderService}")
public interface FeignService {

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    String getByOrderService();

}
