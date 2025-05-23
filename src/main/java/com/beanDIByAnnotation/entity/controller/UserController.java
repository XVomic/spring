package com.beanDIByAnnotation.entity.controller;

import com.beanDIByAnnotation.entity.User;
import com.beanDIByAnnotation.entity.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Resource(name = "UserService")
    private UserService userService;

    public void save() {
        System.out.println("Controller使用UserService接口的实现类的实例（自动注入）调用save方法");
        this.userService.save();
    }
}
