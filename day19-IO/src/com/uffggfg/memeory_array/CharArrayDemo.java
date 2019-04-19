package com.uffggfg.memeory_array;

import java.io.*;

//字符的数组流/内存流
public class CharArrayDemo {
    public static void main(String[] args) {
        try {
            //字符数组输出流：程序-->内存
            CharArrayWriter out = new CharArrayWriter();
            out.write("123456abc好");
            //要使用存储的临时数据
            char[] buffer = out.toCharArray();
            //字符数组输入流：内存-->程序
            CharArrayReader in = new CharArrayReader(buffer);
            char[] bys = new char[1024];
            int len = -1;
            while ((len = in.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
