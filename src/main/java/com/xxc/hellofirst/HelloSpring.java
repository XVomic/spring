package com.xxc.hellofirst;

public class HelloSpring {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println(userName+"  Hello Spring");
    }
}
