package com.pan.user.service.service;


import com.pan.user.service.entity.TestModel;

/**
 * @Author: Pan P Zhu
 * @Date: 22/07/2019 17:17
 * @Description: 测试service
 */
public interface TestService {


    /**
     *
     * @return
     */
    String getTestString();


    /**
     *
     * @return
     */
    TestModel getUserInfo();

}
