package com.uffggfg.review;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;

//拷贝指定目录的指定文件到指定目录

/**
 * 需求：把F:\study2\idea-workspace\day19-IO  测试文件\A中的java文件拷贝到
 * F:\study2\idea-workspace\day19-IO  测试文件\B中并把文件拓展名改为txt
 */
public class CopyDemo {
    public static void main(String[] args) {
        //  1:)筛选出A中所有java文件
        //创建源对象和目标对象
        File srcDir = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\A");
        File desDir = new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\B");
        File[] fs = srcDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".java");
            }
        });
        //System.out.println(Arrays.toString(fs));

        //  2:)将java文件复制到B中并将后缀名改为.txt
        for (File file : fs) {
            try (//创建输入输出对象
                 FileInputStream in = new FileInputStream(file);
                 FileOutputStream out = new FileOutputStream(new File(desDir, file.getName()));) {
                //输入输出操作
                byte[] buffer = new byte[1024];//一次性可以读取1024字节
                int len = -1;
                while ((len = in.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //file.renameTo(new File(desDir,file.getName().replace(".java",".txt")));
        }

        //  3:)将java文件后缀名改为txt
        for (File file : desDir.listFiles()) {
            if (file.getName().contains(".java")) {
                String newFileName = file.getName().replace(".java", ".txt");
                file.renameTo(new File(desDir, newFileName));
            }
        }
    }
}
