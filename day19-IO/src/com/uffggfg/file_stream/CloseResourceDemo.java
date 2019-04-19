package com.uffggfg.file_stream;

import java.io.*;

public class CloseResourceDemo {
    public static void main(String[] args) {
        test();
        test2();
    }

    //Java7提供的自动资源关闭，在try后面圆括号中打开资源
    private static void test2() {
        //创建源和目标
        File srcFile = new File("F:\\study2\\123.txt");
        File desFile = new File("F:\\study2\\456.txt");
        try ( //创建输入输出对象
              FileInputStream in = new FileInputStream(srcFile);
              FileOutputStream out = new FileOutputStream(desFile);) {
            //输入/输出操作
            byte[] buffer = new byte[10];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                //System.out.println(new String(buffer, 0, len));
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //创建源和目标
            File srcFile = new File("F:\\study2\\123.txt");
            File desFile = new File("F:\\study2\\456.txt");
            //创建输入输出对象
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(desFile);
            //输入/输出操作
            byte[] buffer = new byte[10];
            int len = -1;
            while ((len = in.read(buffer)) != -1) {
                //System.out.println(new String(buffer, 0, len));
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
