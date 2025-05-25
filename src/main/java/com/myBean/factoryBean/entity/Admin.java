package com.myBean.factoryBean.entity;

public class Admin {
    private String name;
    private String password;

    public Admin(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
