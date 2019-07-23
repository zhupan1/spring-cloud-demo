package com.pan.order.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:02
 * @Description: feign-用户服务接口
 */
@FeignClient(value = "${feign.userService}", path = "/user-service/")
public interface FeignUserService {


    /**
     * 测试用户服务接口
     * @return 字符串
     */
    @GetMapping(value = "test")
    String expose();

}
