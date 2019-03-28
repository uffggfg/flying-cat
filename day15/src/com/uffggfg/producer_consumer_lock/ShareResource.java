package com.uffggfg.producer_consumer_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//共享资源对象,存储数据年龄与性别
public class ShareResource {
    private String name;
    private String gender;
    private boolean isEmpty = true;//判断共享资源对象是否为空的状态
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    /**
     * 用于生产者向共享资源对象中存储数据
     *
     * @param name   存储的姓名
     * @param gender 存储的性别
     */
    public void creat(String name, String gender) {
        lock.lock();//获取锁
        try {
            while (!isEmpty) {
                condition.await();
            }
            //-----生产开始-----
            this.name = name;
            Thread.sleep(10);
            this.gender = gender;
            //-----生产结束-----
            isEmpty = false;
            condition.signalAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();//释放锁
        }
    }

    /**
     * 用于消费者从共享对象中取出数据
     */
    public void buy() {
        lock.lock();
        try {
            while (isEmpty) {
                condition.await();
            }
            //-----开始消费-----
            Thread.sleep(10);
            System.out.println(this.name + "-" + this.gender);
            //-----完成消费-----
            isEmpty = true;
            condition.signalAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
