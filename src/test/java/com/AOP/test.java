package com.AOP;

import com.AOP.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.update();
    }
}
