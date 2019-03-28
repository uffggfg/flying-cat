package com.uffggfg.thread_method;

class DaemonThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(super.getName() + "-" + super.isDaemon());
        }
    }
}

//后台线程
public class DaemonDemo {
    public static void main(String[] args) {
        //主线程不是后台线程
        System.out.println(Thread.currentThread().isDaemon());
        for (int i = 0; i < 500; i++) {
            System.out.println("main " + i);
            if (i == 100) {
                DaemonThread d = new DaemonThread();
                d.setDaemon(true);//设置子线程为后台线程
                d.start();
            }
        }
    }
}
