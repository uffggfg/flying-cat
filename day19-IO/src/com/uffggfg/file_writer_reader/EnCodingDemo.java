package com.uffggfg.file_writer_reader;

import java.util.Arrays;

//编码和解码
public class EnCodingDemo {
    public static void main(String[] args) throws Exception{
        String msg = "会丢额";
        //编码：String-->byte[]
        byte[] data = msg.getBytes("UTF-8");
        System.out.println(Arrays.toString(data));
        //解码：byte[]-->String
        String ret = new String(data,"ISO-8859-1");
        System.out.println(ret);
        //因为服务器是老外写的，所以使用的是他们自己的编码方式：ISO-8859-1，中文就会乱码
        //解决方式：重新编码
        data = ret.getBytes("ISO-8859-1");
        ret = new String(data,"UTF-8");
        System.out.println(ret);
    }
}
