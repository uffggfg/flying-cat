package com.uffggfg.buffer;

import java.io.*;

//字节缓冲流

/**
 * 需求：将F:\study2\idea-workspace\day19-IO  测试文件\D\src1.txt拷贝到
 * F:\study2\idea-workspace\day19-IO  测试文件\D\des1.txt
 */
public class BufferedStreamDemo {
    public static void main(String[] args) {
        File srcFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\src1.txt");
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\des1.txt");
        try (//字节缓冲输入，输出流
             BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(desFile))) {
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
