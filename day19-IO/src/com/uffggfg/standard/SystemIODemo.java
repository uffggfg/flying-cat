package com.uffggfg.standard;

import java.io.FileInputStream;
import java.io.PrintStream;

//标准化输入输出
public class SystemIODemo {
    public static void main(String[] args) throws Exception {
        System.out.println("begin---");
        int data = System.in.read();//接受键盘输入的一个字节
        System.out.println(data);
        System.out.println("end---");
        System.out.println("begin---");
        //重定向标准换输入
        System.setIn(new FileInputStream("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\systemIO.txt"));
        //重定向标准化输出
        System.setOut(new PrintStream("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\systemIO2.txt"));
        System.out.println("end---");
    }
}
