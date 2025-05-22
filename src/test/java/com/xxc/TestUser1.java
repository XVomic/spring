package com.xxc;

import com.xxc.denpendencyInject.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User1 user = (User1)context.getBean("user1");
        System.out.println(user);

    }
}
