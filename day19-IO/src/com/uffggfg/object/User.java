package com.uffggfg.object;

import java.io.Serializable;

public class User implements Serializable{
    private static final long serialVersionUID = 1L;//在类中提供一个固定的序列化ID
    private String name;
    transient private String passWord;//密码等不需要做序列化的用transient修饰
    private int age;

    public User(String name, String passWord, int age) {
        this.name = name;
        this.passWord = passWord;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}
