package com.beanlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
    public static void main(String[] args) {
        //此处获取上下文对象时，会对于相关的配置文件中所有注册的bean实例化
        //所以由于三个bean共用一个xml文件，所以会对于三个bean都实例化，如果只要对应的，就需要将三个bean注册分离到三个xml中
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeans.xml");
        Object bean2 = context.getBean("bean2");
        System.out.println(bean2.getClass().getName());

//        System.out.println(context.getBean("bean2"));
    }
}
