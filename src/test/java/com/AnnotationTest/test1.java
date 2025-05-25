package com.AnnotationTest;

import com.beanDIByAnnotation.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAnnotation.xml");
        UserController userController = (UserController) context.getBean("UserController");
        userController.save();
    }
}
