package com.uffggfg.file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//演示文件字节输入流
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建源
        File f = new File("Stream.txt");
        //创建文件字节输入流
        FileInputStream in = new FileInputStream(f);
        //输入操作
        /**
         * int read()
         * 从该输入流读取一个字节的数据。
         * int read(byte[] b)
         * 从该输入流读取最多 b.length个字节的数据为字节数组。
         * int read(byte[] b, int off, int len)
         * 从该输入流读取最多 len字节的数据为字节数组。
         */
//
//        System.out.println(in.read());
//        byte[] b = new byte[15];
//        int ret = in.read(b);
//        System.out.println(Arrays.toString(b));
//        String str = new String(b,0,8);
//        System.out.println(str);
        //关闭资源对象
        //读取文件所有数据
        byte[] b = new byte[3];
        int len = -1;
        while ((len = in.read(b)) != -1) {
            String str = new String(b, 0, len);
            System.out.println(str);
        }
        in.close();//关闭资源对象

    }
}
