package com.uffggfg.file;

import java.io.File;
import java.io.FilenameFilter;

//文件过滤器(FilenameFilter)
public class FileDemo6 {
    public static void main(String[] args) {
        File dir = new File("F:\\study\\思修");
        File[] f = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile() && name.endsWith(".mp4");
            }
        });
        for (File file : f){
            System.out.println(file);
        }
    }
}
