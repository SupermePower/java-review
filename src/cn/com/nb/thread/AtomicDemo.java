package cn.com.nb.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/6 上午11:06
 */
public class AtomicDemo {

    static AtomicInteger number = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new AtomicLocal());
        Thread t2 = new Thread(new AtomicLocal());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(number.get());
    }

    static class AtomicLocal implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                add();
            }
        }

        public void add() {
            number.incrementAndGet();
        }
    }
}
