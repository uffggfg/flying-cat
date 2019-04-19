package com.uffggfg.print;

import java.io.IOException;
import java.io.PrintStream;

//字节打印流
public class PrintStreamDemo {
    public static void main(String[] args) {
        try (
                PrintStream ps = new PrintStream("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\printStream.txt");
        ) {
            ps.write("123abc".getBytes());
            ps.print(1);
            ps.print(true);
            ps.print("good");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
