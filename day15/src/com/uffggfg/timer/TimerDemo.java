package com.uffggfg.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

//定时器
//需求：在三秒后打印 你好
public class TimerDemo {
    public static void main(String[] args) {
        System.out.println("begin");
        new Timer().schedule(new XX(),3000,1000);
        System.out.println("end");
    }
}
class XX extends TimerTask{
    @Override
    public void run() {
        System.out.println(new Date().toLocaleString());
    }
}
