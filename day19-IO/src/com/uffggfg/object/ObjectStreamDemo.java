package com.uffggfg.object;

import java.io.*;

//使用对象流实现序列化和反序列化
public class ObjectStreamDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\object.txt");
        writeObj(f);
        readObj(f);
    }

    //反序列化操作
    private static void readObj(File f) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));){
            Object user = in.readObject();
            System.out.println(user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //序列化操作
    private static void writeObj(File file) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));) {
            out.writeObject(new User("lily", "123456", 20));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
