package com.beanDIByAnnotation.entity.dao.Impl;

import com.beanDIByAnnotation.entity.User;
import com.beanDIByAnnotation.entity.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

    //改造成使用注解的方式自动装配，而不是直接使用上下文获取bean
    @Autowired
    private User user1;

    @Override
    public void save() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAnnotation.xml");
//        User user1 = (User)applicationContext.getBean("user");
        System.out.println(user1);
        System.out.println("模拟数据库访问实现save user");
    }
}
