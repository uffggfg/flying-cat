package com.uffggfg.randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

//读写文件任意位置
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        File f = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\诗.txt");
        read(f);
        //write(f);
    }

    private static void write(File f) {
        try (
                RandomAccessFile r = new RandomAccessFile(f, "rw");
        ) {
            r.writeByte(56);
            r.writeUTF("good123好");
            r.writeInt(22);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void read(File f) {
        try (
                RandomAccessFile r = new RandomAccessFile(f, "rw");
        ) {
            System.out.println("文件指针位置" + r.getFilePointer());
            System.out.println(r.readByte());
            System.out.println("文件指针位置" + r.getFilePointer());
            System.out.println(r.readUTF());
            r.seek(0);//设置文件指针为0字节
            System.out.println("文件指针位置" + r.getFilePointer());
            System.out.println(r.readInt());
            r.skipBytes(4);//设置文件指针跳过4个字节
            System.out.println("文件指针位置" + r.getFilePointer());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
