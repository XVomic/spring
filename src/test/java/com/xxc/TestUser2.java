package com.xxc;

import com.xxc.denpendencyInject.User2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User2 u = (User2)context.getBean("user2");
        System.out.println(u);
    }
}
