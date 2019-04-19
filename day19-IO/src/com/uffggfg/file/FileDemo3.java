package com.uffggfg.file;

import java.io.File;

//需求：列出指定目录中所有文件，包括子文件夹所有文件（使用递归算法）
public class FileDemo3 {
    public static void main(String[] args) {
        File dir = new File("F:\\study");
        listAllFile(dir);
    }

    /**
     * 列出所有的文件
     * @param f     目录名
     */
    private static void listAllFile(File f) {
        File[] fs = f.listFiles();
        for (File file : fs){
            //如果子文件是文件，则打印
            System.out.println(file);
            if (file.isDirectory()){
                //如果子文件是目录，则继续递归
                listAllFile(file);
            }
        }
    }
}
