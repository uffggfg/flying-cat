package com.uffggfg.thread_method;

class Join extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 500;i++){
            System.out.println("join  " + i);
        }
    }
}
//联合线程
public class JoinDemo {
    public static void main(String[] args) throws Exception {
        Join join = new Join();
        System.out.println("begin---");
        for (int i = 0;i < 500;i++){
            System.out.println("main  " + i);
            if (i == 100){
                join.start();//启动join线程
            }
            if (i == 200){
                join.join();//强制运行该线程
            }
        }
        System.out.println("end-----");
    }
}
