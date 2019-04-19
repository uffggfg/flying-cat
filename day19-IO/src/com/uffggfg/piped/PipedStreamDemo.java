package com.uffggfg.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//A线程发送数据给B线程
class AThread extends Thread {
    private PipedOutputStream out = new PipedOutputStream();

    public PipedOutputStream getOut() {
        return out;
    }

    @Override
    public void run() {
        try {
            for (int i = 65; i < 65 + 26; i++) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

//B线程接受A线程发送的数据
class BThread extends Thread {
    PipedInputStream in = null;

    public BThread(AThread aThread) throws Exception {
        in = new PipedInputStream(aThread.getOut());
    }

    @Override
    public void run() {
        int len = -1;
        try {
            while ((len = in.read()) != -1) {
                System.out.println((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

//管道流
public class PipedStreamDemo {
    public static void main(String[] args) throws Exception {
        AThread a = new AThread();
        BThread b = new BThread(a);
        a.start();
        b.start();
    }
}
