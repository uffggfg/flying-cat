package com.uffggfg.producer_consumer_lock;

//测试类
public class Test {
    public static void main(String[] args) {
        //创建共同资源对象
        ShareResource resource = new ShareResource();
        //启动生产者线程
        new Thread(new Producer(resource)).start();
        //启动消费者线程
        new Thread(new Consumer(resource)).start();

    }
}
