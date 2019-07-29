package com.pan.user.service.service.impl;

import com.pan.model.service.entity.UserModel;
import com.pan.user.service.dao.UserDao;
import com.pan.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Pan P Zhu
 * @Date: 23/07/2019 17:08
 * @Description: 实现类
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao testDao;


    @Override
    public UserModel getUserInfo() {
        return testDao.getUserInfo();
    }

}
