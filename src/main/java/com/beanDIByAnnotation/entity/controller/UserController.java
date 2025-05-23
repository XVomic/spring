package com.beanDIByAnnotation.entity.controller;

import com.beanDIByAnnotation.entity.User;
import com.beanDIByAnnotation.entity.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import jakarta.annotation.Resource;
//import javax.annotation.Resource;

@Controller()
public class UserController {
//    @Resource(name="UserService")
    //容易出现版本兼容问题
    //jakarta与javax中的annotation版本不要同时使用
    //1.8使用javax.annotation版本才能生效，9以上使用jakarta
    //二者不可同时导入
    //旧版 Spring 可能不识别jakarta.annotation.Resource，需手动配置@EnableAspectJAutoProxy等注解。

//    所以这里我们全部改用autowired自动注入

    @Autowired
    private UserService userService;

    public void save() {
        System.out.println("Controller使用UserService接口的实现类的实例（自动注入）调用save方法");
        this.userService.save();
    }
}
