package com.pan.user.service.service.impl;

import com.pan.user.service.dao.TestDao;
import com.pan.user.service.entity.TestModel;
import com.pan.user.service.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:08
 * @Description: 实现类
 */
@Service
public class TestServiceImpl implements TestService {


    @Value("${description}")
    private String description;

    @Autowired
    private TestDao testDao;


    @Override
    public String getTestString() {
        return description;
    }


    @Override
    public TestModel getUserInfo() {
        return testDao.getUserInfo();
    }

}
