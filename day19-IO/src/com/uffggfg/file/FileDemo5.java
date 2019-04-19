package com.uffggfg.file;

import java.io.File;

//批量修改文件名称
public class FileDemo5 {
    public static void main(String[] args) {
        File dir = new File("F:\\study2\\123");
        File[] f = dir.listFiles();
        String deleteText = "四川农业大学-第一学期-王枥";
        for (File file : f){
            if (file.getName().contains(deleteText)){
                String newFileName = file.getName().replace(deleteText,"");
                file.renameTo(new File(dir,newFileName));
            }
        }
    }
}
