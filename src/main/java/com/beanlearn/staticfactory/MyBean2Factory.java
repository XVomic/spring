package com.beanlearn.staticfactory;

public class MyBean2Factory {

    //是否注册bean标签可判断是否是普通bean
    public MyBean2Factory() {
        System.out.println("MyBean2Factory is static Factory");
    }

//    静态方法是在编译时就已经实例化
    public static Bean2 createBean() {
        return new Bean2();
    }
}
