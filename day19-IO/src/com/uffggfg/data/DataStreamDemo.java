package com.uffggfg.data;

import java.io.*;

//数据流
public class DataStreamDemo {
    public static void main(String[] args) {
        File f = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\data.txt");
        write(f);
        read(f);
    }

    private static void read(File f) {
        try (
                DataInputStream in = new DataInputStream(new FileInputStream(f));
        ) {
            System.out.println(in.readBoolean());
            System.out.println(in.readInt());
            System.out.println(in.readChar());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write(File f) {
        try (
                DataOutputStream out = new DataOutputStream(new FileOutputStream(f))
        ) {
            out.writeBoolean(true);
            out.writeInt(78);
            out.writeChars("好的1er");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
