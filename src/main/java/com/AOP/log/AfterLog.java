package com.AOP.log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AfterLog implements AfterReturningAdvice {

    /**
     * @param returnValue 目标方法的返回值
     * @param method      目标方法
     * @param args        目标方法的参数
     * @param target      目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("【后置通知】类: " + target.getClass().getName() +
                ", 方法: " + method.getName() +
                ", 参数: " + Arrays.toString(args) +
                ", 返回值: " + returnValue);
        // 在这里添加你的后置日志逻辑
    }
}