package com.uffggfg.buffer;

import java.io.*;

/**
 * 字符缓冲流
 * 需求：将F:\study2\idea-workspace\day19-IO  测试文件\D\src.txt拷贝到
 * F:\study2\idea-workspace\day19-IO  测试文件\D\des2.txt
 */
public class buffered_writer_reader {
    public static void main(String[] args) {
        //创建源和目标对象
        File srcFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\src.txt");
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\des2.txt");
        try (//创建字符缓冲流对象
             BufferedReader in = new BufferedReader(new FileReader(srcFile));
             BufferedWriter out = new BufferedWriter(new FileWriter(desFile));) {
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
                //换行方法：out.newLine;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
