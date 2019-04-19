package com.uffggfg.buffer;

import java.io.*;

//节点流和缓冲流性能对比
public class StreamVSBufferedStream {
    public static void main(String[] args) {
        File srcFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\爱剪辑.mp4");
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\爱.mp4");
        test1(srcFile, desFile);//节点流
        test2(desFile, desFile);//缓冲流
    }

    private static void test2(File srcFile, File desFile) {
        long begin = System.currentTimeMillis();
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
        System.out.println("缓冲流用时： " + (System.currentTimeMillis() - begin) + "ms");
    }

    private static void test1(File srcFile, File desFile) {
        long begin = System.currentTimeMillis();
        try ( //创建输入输出对象
              InputStream in = new FileInputStream(srcFile);
              OutputStream out = new FileOutputStream(desFile);) {
            //输入/输出操作
            int len = -1;
            while ((len = in.read()) != -1) {
                out.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("节点流用时： " + (System.currentTimeMillis() - begin) + "ms");
    }
}
