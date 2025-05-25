package com.proper.readConfig;

import com.beanAnnotation.fundation.model.User;
import com.proper.readFromFile.Appconfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class AppConfigFromConfig {
    @Value("#{authorConfig.name}")
    private String createName;

    @Bean
    User nameFromPropertySourceFile() {
        return new User(createName);
    }

    public static void main(String[] args) {
//
//        System.out.println(new Appconfig().createName);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigFromConfig.class);
        Object nameFromPropertySource = context.getBean("nameFromPropertySourceFile");
        System.out.println(nameFromPropertySource.toString());

        User bean = context.getBean(User.class);
        System.out.println(bean.toString());

    }
}
