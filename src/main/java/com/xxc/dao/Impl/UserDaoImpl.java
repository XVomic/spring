package com.xxc.dao.Impl;

import com.xxc.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean login(String userName, String password) {
        if(userName.equals("xxc") && password.equals("123")){
            return true;

        }
        return false;
    }
}
