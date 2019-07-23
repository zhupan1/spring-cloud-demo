package com.pan.user.service.feign.expose;

import com.pan.user.service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:10
 * @Description: 用户服务向外暴露接口
 */
@RestController
@RequestMapping(value = "/user-service/")
public class UserServiceExpose {

    @Autowired
    private TestService testService;


    /**
     *
     * @return
     */
    @GetMapping(value = "test")
    public String expose() {
        return testService.getTestString();
    }


}
