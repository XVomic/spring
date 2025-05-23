package com.beanDIByAnnotation.entity.service.Impl;

import com.beanDIByAnnotation.entity.User;
import com.beanDIByAnnotation.entity.dao.UserDao;
import com.beanDIByAnnotation.entity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//下面这两包不要同时使用
import jakarta.annotation.Resource;
//import javax.annotation.*;

@Service("UserService")
public class UserServiceImpl implements UserService {
    //使用接口实现松耦合，但是注入的对象时实现类的实例
//    @Resource(name="UserDao")
    @Autowired
    private UserDao userDao;


    @Override
    public void save() {
        System.out.println("serviceImpl实例调用UserDao接口对应实现类的实例完成操作");
        this.userDao.save();

    }
}
