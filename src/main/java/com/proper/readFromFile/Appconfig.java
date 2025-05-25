package com.proper.readFromFile;

import com.beanAnnotation.fundation.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScans()
@PropertySource("application.properties")
public class Appconfig {
    @Value("${create.name:nb}")
    private String createName;

    @Bean
    User nameFromPropertySource() {
        return new User(createName);
    }

    public static void main(String[] args) {
//
//        System.out.println(new Appconfig().createName);
    ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Object nameFromPropertySource = context.getBean("nameFromPropertySource");
        System.out.println(nameFromPropertySource.toString());

        User bean = context.getBean(User.class);
        System.out.println(bean.toString());

    }
}

/*
核心作用
@Bean注解的主要功能是将方法的返回值注册为 Spring 容器里的 bean。这种方式和在 XML 文件中定义 bean 是等效的，不过它采用的是 Java 代码的形式。
应用场景
配置第三方组件：当需要把不是自己编写的第三方类（如 Redis 客户端、数据库连接池等）纳入 Spring 容器管理时，就可以使用@Bean注解。
自定义 bean 的创建逻辑：如果 bean 的创建过程比较复杂，需要编写特定的初始化代码，那么通过@Bean注解能更好地控制这个过程。
与@Configuration配合使用：在配置类中，@Bean注解常常和@Configuration注解一起使用，用于构建应用的组件结构。
 */
