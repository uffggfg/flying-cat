package com.uffggfg.review;

import java.io.*;

//案例：获取进程数据，编译运行java代码
//在dos运行
public class ProcessDemo {
    public static void main(String[] args) {
        String str = "System.out.println(\"Hello World\")";
        eval(str);
    }

    //执行str参数，并在控制台打印出“Hello World”
    private static void eval(String str) {
        //用Stringbuilder拼接处HelloWorld程序
        StringBuilder sb = new StringBuilder(80);
        sb.append("public class Hello{");
        sb.append("public static void main(String[] args){");
        sb.append(str);
        sb.append(";");
        sb.append("}");
        sb.append("}");
        //保存到一个叫Hello.java的文件中
        File desFile = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\ProcessDemo\\Hello.java");
        try (//创建输出流对象
             OutputStream out = new FileOutputStream(desFile);) {
            out.write(sb.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //调用javac编译程序
        Process javacProcess = null;
        try {
            javacProcess = Runtime.getRuntime().exec("javac Hello.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //读取流中的数据
        try (InputStream error = javacProcess.getErrorStream();) {
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = error.read(buffer)) != -1) {
                String msg = new String(buffer, 0, len);
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //调用java运行程序
        Process javaProcess = null;
        try {
            javaProcess = Runtime.getRuntime().exec("java Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //读取流中的数据
        try (InputStream info = javaProcess.getErrorStream();) {
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = info.read(buffer)) != -1) {
                String msg = new String(buffer, 0, len);
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
