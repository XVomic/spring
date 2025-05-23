package com.beanDIByAnnotation.entity.dao.Impl;

import com.beanDIByAnnotation.entity.User;
import com.beanDIByAnnotation.entity.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationAnnotation.xml");
        User user1 = (User)applicationContext.getBean("user");
        System.out.println(user1);
        System.out.println("模拟数据库访问实现save user");
    }
}
