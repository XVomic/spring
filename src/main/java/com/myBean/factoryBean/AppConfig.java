package com.myBean.factoryBean;

import com.beanAnnotation.fundation.model.User;
import com.myBean.factoryBean.entity.Admin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    User CreateUser(){
        return new User("zhangsan");
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User bean = ctx.getBean(User.class);
        System.out.println(bean.getClass().getName());
        Admin admin = ctx.getBean(Admin.class);
        System.out.println(admin.getClass().getName());
        System.out.println(admin.toString());
    }
}
