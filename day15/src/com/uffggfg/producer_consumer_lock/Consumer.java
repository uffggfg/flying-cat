package com.uffggfg.producer_consumer_lock;

//消费者类
public class Consumer implements Runnable {
    private ShareResource resource = null;

    public Consumer(ShareResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            resource.buy();
        }
    }
}
