package com.xxc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpring {
    public static void main(String[] args) {
//        初始化spring容器，加载applicationContext.xml配置
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取上下文配置文件中定义的helloSpring实例
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        helloSpring.show();
    }
}
