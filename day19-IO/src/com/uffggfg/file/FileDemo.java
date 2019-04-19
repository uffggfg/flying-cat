package com.uffggfg.file;

import java.io.File;

//系统平台的分隔符
public class FileDemo {
    public static void main(String[] args) {
        //获取属性分隔符
        String pathSeparator = File.pathSeparator;
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparator + "---" + pathSeparatorChar);
        //获取路径分隔符
        String separator = File.separator;
        char seprateorChar = File.separatorChar;
        System.out.println(separator + "---" + seprateorChar);
        //表示一个文件的路径
        String path1 = "c:\\will\\123.txt";
        String path2 = "c:/will/123.txt";
        String path3 = "c:" + File.separator + "will" + File.separator + "123.txt";
    }
}
