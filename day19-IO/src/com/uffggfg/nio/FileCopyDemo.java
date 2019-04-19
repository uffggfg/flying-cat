package com.uffggfg.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyDemo {
    public static void main(String[] args) throws Exception {
        Files.copy(Paths.get("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\诗.txt"),new FileOutputStream("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D123to.txt"));
        Files.copy(new FileInputStream("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\作者.txt"),Paths.get("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\作者to.txt"));
    }
}
