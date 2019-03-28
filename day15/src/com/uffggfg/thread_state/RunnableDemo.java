package com.uffggfg.thread_state;

class Other extends Thread{
    @Override
    public void run() {
        //---------
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Other other = new Other();
        other.start();
        //other.start();//start只能调用一次,否则报错
    }
}
