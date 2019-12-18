package cn.com.nb.hello;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description
 * @author: liying.fu
 * @Date: 2018/12/16 上午10:42
 */
public class Ticket implements Runnable {
    private volatile AtomicInteger integer = new AtomicInteger(10);

    @Override
    public void run() {
        int ticketCount = integer.decrementAndGet();
        if (ticketCount > 0) {
            System.out.println(Thread.currentThread().getName() + "->" + ticketCount);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException("票已经被抢光了...");
        }
    }
}