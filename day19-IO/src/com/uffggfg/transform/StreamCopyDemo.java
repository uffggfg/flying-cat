package com.uffggfg.transform;

import java.io.*;

//字节流转字符流
public class StreamCopyDemo {
    public static void main(String[] args) {
        File srcFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\src1.txt");
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\des1.txt");
        try (Reader in = new InputStreamReader(new FileInputStream(srcFile),"UTF-8");
             Writer out = new OutputStreamWriter(new FileOutputStream(desFile),"UTF-8")) {
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
