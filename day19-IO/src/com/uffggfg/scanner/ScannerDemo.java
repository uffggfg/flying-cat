package com.uffggfg.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\诗.txt","UTF-8");
        //扫描文件中的数据
        //Scanner sc = new Scanner(new File("F:\\study2\\idea-workspace\\day19-IO  测试文件\\D\\诗.txt"),"UTF-8");
        //扫描键盘输入的数据
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
