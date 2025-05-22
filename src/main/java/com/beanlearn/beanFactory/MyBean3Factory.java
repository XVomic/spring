package com.beanlearn.beanFactory;

public class MyBean3Factory {

//    实例工厂

    public MyBean3Factory() {
        System.out.println("实例工厂作为bean对象在实例化中");
    }

    public Bean3 createBean3() {
        return new Bean3();
    }
}
