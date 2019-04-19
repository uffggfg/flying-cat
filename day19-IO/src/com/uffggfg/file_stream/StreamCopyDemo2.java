package com.uffggfg.file_stream;

import java.io.*;

//使用字节流完成文件拷贝
// 将F:\study2\123.txt的内容拷贝到F:\study2\456.txt中
public class StreamCopyDemo2 {
    public static void main(String[] args) throws IOException {
        //创建源和目标
        File srcFile = new File("F:\\study2\\123.txt");
        File desFile = new File("F:\\study2\\456.txt");
        //创建输入输出对象
        InputStream in = new FileInputStream(srcFile);
        OutputStream out = new FileOutputStream(desFile);
        //输入/输出操作
        byte[] buffer = new byte[10];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            //System.out.println(new String(buffer, 0, len));
            out.write(buffer, 0, len);
        }
        //关闭资源
        in.close();
        out.close();
    }
}
