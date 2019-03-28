package com.uffggfg.producer_consumer_lock;

//生产者类
public class Producer implements Runnable {
    private ShareResource resource = null;

    public Producer(ShareResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                resource.creat("凤姐", "女");
            } else {
                resource.creat("马哥哥", "男");
            }
        }
    }
}
