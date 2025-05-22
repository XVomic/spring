package com.xxc.denpendencyInject;

// 使用构造参数注入
//将需要注入的值当作对象，或者后续也是注入对象！！！嵌套
public class User1 {
    private int id;
    private String userName;
    private String password;

    public User1(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
