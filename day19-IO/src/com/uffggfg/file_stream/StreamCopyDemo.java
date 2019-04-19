package com.uffggfg.file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//使用字节流完成文件的拷贝操作
//将F:\study2\123.txt的内容拷贝到F:\study2\456.txt中
public class StreamCopyDemo {
    public static void main(String[] args) throws IOException {
        //将123.txt文件输入程序
        File f1 = new File("F:\\study2\\123.txt");//创建源
        FileInputStream in = new FileInputStream(f1);//创建输入流对象
        //输入操作
        byte[] buffer = new byte[10];
        int len = -1;
        StringBuilder str = new StringBuilder();
        while ((len = in.read(buffer)) != -1){
            str.append(new String(buffer,0,len));
        }
        in.close();//关闭资源对象
        String str2 = str.toString();
        //将123.txt输出程序
        File f2 = new File("F:\\study2\\456.txt");//创建目标对象
        FileOutputStream out = new FileOutputStream(f2);//创建输出流对象
        out.write(str2.getBytes());//输出操作
        out.close();//关闭资源对象
    }
}
