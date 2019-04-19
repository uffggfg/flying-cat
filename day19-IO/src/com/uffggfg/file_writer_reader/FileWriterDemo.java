package com.uffggfg.file_writer_reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//文件字符输出流
public class FileWriterDemo {
    public static void main(String[] args) {
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\1.txt");
        try (//创建文件字符输出流对象
             Writer out = new FileWriter(desFile);){
            /**
             * void write(int c)
             * 写一个字符
             * void write(String str)
             * 写一个字符串
             * void write(String str, int off, int len)
             * 写一个字符串的一部分。
             */
            out.write("will好的呢123");
            out.write("123bad哈哈".toCharArray());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
