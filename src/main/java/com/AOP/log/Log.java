package com.AOP.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Log implements MethodBeforeAdvice {

    /**
     * @param method  要执行的目标对象的方法
     * @param args    目标方法的参数
     * @param target  目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【前置通知】类: " + target.getClass().getName() +
                ", 方法: " + method.getName() +
                ", 参数: " + Arrays.toString(args));
        // 在这里添加你的前置日志逻辑
    }
}