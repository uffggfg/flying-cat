package com.uffggfg.file_writer_reader;

import java.io.*;

/**
 * 需求：将F:\study2\idea-workspace\day19-IO  测试文件\D\src.txt拷贝到
 *      F:\study2\idea-workspace\day19-IO  测试文件\D\des.txt
 */
public class FileCopyDemo {
    public static void main(String[] args) {
        //创建源和目标对象
        File srcFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\src.txt");
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\des.txt");
        try (//创建文件字符输入，输出对象
             Reader in = new FileReader(srcFile);
             Writer out = new FileWriter(desFile);){
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = in.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
