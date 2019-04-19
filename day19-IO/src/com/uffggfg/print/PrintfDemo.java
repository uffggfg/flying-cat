package com.uffggfg.print;
//java的格式化输出
public class PrintfDemo {
    public static void main(String[] args) {
        String name = "Lily";
        int age = 12;
        //传统做法
        System.out.println("姓名：" + name + "年龄：" + age);
        //格式化输出
        System.out.printf("姓名：%s年龄：%d\n",name,age);
    }
}
