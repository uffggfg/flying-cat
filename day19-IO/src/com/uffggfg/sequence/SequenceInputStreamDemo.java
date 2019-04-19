package com.uffggfg.sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

//合并流(顺序流)
public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        File file1 = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\诗.txt");
        File file2 = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\作者.txt");
        try (//创建合并流对象
             SequenceInputStream in = new SequenceInputStream(new FileInputStream(file1), new FileInputStream(file2))) {
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
