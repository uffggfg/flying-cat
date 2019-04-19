package com.uffggfg.file_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//演示文件字节输出流
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建目标对象（将数据保存到哪一个文件）
        File file = new File("Stream.txt");
        //创建文件字节输出流对象
        FileOutputStream out = new FileOutputStream(file, true);//true表示追加文件内容，默认是false
        //具体输出操作
        /**
         * void write(byte[] b)
         * 将 b.length个字节从指定的字节数组写入此文件输出流。
         * void write(byte[] b, int off, int len)
         * 将b数组中从off位置开始len个字节写出去
         * void write(int b)
         * 将指定的字节写入此文件输出流。
         */
        out.write(56);
        out.write("ABCD".getBytes());
        out.write("0123456789".getBytes(), 1, 2);
        //关闭资源对象
        out.close();
    }
}
