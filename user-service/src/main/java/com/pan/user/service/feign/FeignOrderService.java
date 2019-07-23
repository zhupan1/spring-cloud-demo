package com.pan.user.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:02
 * @Description: feign-订单服务接口
 */
@FeignClient(value = "${feign.orderService}", path = "/order-service/")
public interface FeignOrderService {


    /**
     * 测试订单服务接口
     * @return 字符串
     */
    @GetMapping(value = "test")
    String getByOrderService();

}
