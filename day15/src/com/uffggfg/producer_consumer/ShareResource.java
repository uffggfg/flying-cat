package com.uffggfg.producer_consumer;

//共享资源对象,存储数据年龄与性别
public class ShareResource {
    private String name;
    private String gender;
    private boolean isEmpty = true;//判断共享资源对象是否为空的状态

    /**
     * 用于生产者向共享资源对象中存储数据
     *
     * @param name   存储的姓名
     * @param gender 存储的性别
     */
    public synchronized void creat(String name, String gender) {
        try {
            while (!isEmpty) {//当isEmpty为false时，等着消费者来消费
                //使用同步锁对象来调用，表示当前对象释放同步锁，进入等待池，只能由其他线程所唤醒
                this.wait();
            }
            //-----生产开始-----
            this.name = name;
            Thread.sleep(10);
            this.gender = gender;
            //-----生产结束-----
            isEmpty = false;//设置共享资源对象不为空
            this.notify();//唤醒一个消费者对象

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 用于消费者从共享对象中取出数据
     *
     */
    public synchronized void buy() {
        try {
            while (isEmpty) {//当isEmpty为true时，等着生产者来生产
                //使用同步锁对象来调用，表示当前对象释放同步锁，进入等待池，只能由其他线程所唤醒
                this.wait();
            }
            //-----开始消费-----
            Thread.sleep(10);
            System.out.println(this.name + "-" + this.gender);
            //-----完成消费-----
            isEmpty = true;//设置共享资源对象为空
            this.notify();//唤醒一个生产者对象
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
