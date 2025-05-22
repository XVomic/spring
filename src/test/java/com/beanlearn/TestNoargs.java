package com.beanlearn;

import com.beanlearn.noargs.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNoargs {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationBeans.xml");
        Bean1 bean1 = (Bean1) context.getBean("bean1");

    }
}
