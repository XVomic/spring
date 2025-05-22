package com.xxc.service.Impl;

import com.xxc.dao.UserDao;
import com.xxc.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    //setter方法注入依赖对象实例
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String username, String password) {
        return userDao.login(username, password);
    }
}
