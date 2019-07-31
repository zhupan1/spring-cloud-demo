package com.pan.user.service.common.util;


import com.pan.user.service.feign.FeignOrderService;
import org.springframework.stereotype.Component;

/**
 * @Author: Pan P Zhu
 * @Date: 31/07/2019 14:27
 * @Description: hystrix断路器
 */
@Component
public class OrderServiceHystrix implements FeignOrderService {


    @Override
    public String getByOrderService() {
        return "sorry, orderService服务暂不能使用";
    }



}
