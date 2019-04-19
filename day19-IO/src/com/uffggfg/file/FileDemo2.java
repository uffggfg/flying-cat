package com.uffggfg.file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //创建file对象
        File f1 = new File("c:/demo/123.txt");
        File f2 = new File("c:/demo","123.txt");
        File dir = new File("c:/demo");
        File f3 = new File(dir,"123.txt");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
