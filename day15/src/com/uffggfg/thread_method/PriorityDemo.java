package com.uffggfg.thread_method;

class PriorityThread extends Thread{
    public PriorityThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0;i < 50;i++){
            System.out.println(super.getName() + "--" + i);
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        //Thread.currentThread().setPriority(10);//设置主线程优先级
        //System.out.println(Thread.currentThread().getPriority());
        PriorityThread max = new PriorityThread("高优先级");
        max.setPriority(Thread.MAX_PRIORITY);//优先级10
        PriorityThread min = new PriorityThread("低优先级");
        min.setPriority(Thread.MIN_PRIORITY);//优先级1
        min.start();
        max.start();
        //电脑CPU多线程，并行运行多线程，无法观察
    }
}
