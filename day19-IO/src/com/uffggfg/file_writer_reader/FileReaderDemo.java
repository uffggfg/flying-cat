package com.uffggfg.file_writer_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//文件字符输入流
//运行结果文字乱码：将txt文件编码方式改为UTF-8
public class FileReaderDemo {
    public static void main(String[] args) {
//        int read(char[] cbuf)
//        将字符读入数组。
//        abstract int read(char[] cbuf, int off, int len)
//        将字符读入数组的一部分。
//        int read(CharBuffer target)
//        尝试将字符读入指定的字符缓冲区。
        File srcFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\C\\1\\1.txt");
        try (Reader read = new FileReader(srcFile);) {
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = read.read(buffer)) != -1) {
                System.out.println(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
