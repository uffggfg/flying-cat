package com.uffggfg.memeory_array;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

//字符串流
public class StringReaderwriter {
    public static void main(String[] args) {
        try {
            //字符数组输出流：程序-->内存
            StringWriter out = new StringWriter();
            out.write("123456abc好");
           System.out.println(out.toString());
            //字符数组输入流：内存-->程序
            StringReader in = new StringReader(out.toString());
            char[] bys = new char[1024];
            int len = -1;
            while ((len = in.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
