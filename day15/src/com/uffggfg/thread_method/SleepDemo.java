package com.uffggfg.thread_method;

public class SleepDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("ready---");
        for (int i = 10;i >0;i--){
            System.out.println("倒计时" + i + "秒");
            Thread.sleep(1000);
        }
        System.out.println("go!");
    }
}
