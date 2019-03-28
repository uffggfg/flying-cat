package com.uffggfg.thread_method;

class YieldThread extends Thread{
    public YieldThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0;i < 50;i++){
            System.out.println(super.getName() + "--" + i);
            if (i == 20){
                Thread.yield();
            }
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        //Thread.currentThread().setPriority(10);//设置主线程优先级
        //System.out.println(Thread.currentThread().getPriority());
        YieldThread max = new YieldThread("高优先级");
        max.setPriority(Thread.MAX_PRIORITY);//优先级10
        YieldThread min = new YieldThread("低优先级");
        min.setPriority(Thread.MIN_PRIORITY);//优先级1
        min.start();
        max.start();
        //电脑CPU多线程，并行运行多线程，无法观察
    }
}
