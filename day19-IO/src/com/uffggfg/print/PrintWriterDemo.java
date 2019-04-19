package com.uffggfg.print;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

//字符打印流
public class PrintWriterDemo {
    public static void main(String[] args) {
        File f = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\PrintWriter.txt");
        try (
                PrintWriter ps = new PrintWriter(new FileOutputStream(f),true);
        ) {
            ps.write("123abc");
            ps.print(1);
            ps.print(true);
            ps.print("good");
            ps.print("好");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
