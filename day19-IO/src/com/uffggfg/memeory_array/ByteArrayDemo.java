package com.uffggfg.memeory_array;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//字节的数组流/内存流
public class ByteArrayDemo {
    public static void main(String[] args) {
        try {
            //字节数组输出流：程序-->内存
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            out.write("123456abc".getBytes());
            //要使用存储的临时数据
            byte[] buffer = out.toByteArray();
            //字节数组输入流：内存-->程序
            ByteArrayInputStream in = new ByteArrayInputStream(buffer);
            byte[] bys = new byte[1024];
            int len = -1;
            while ((len = in.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
