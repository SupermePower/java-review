package cn.com.nb.interview.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/23 下午9:11
 */
public class CustomerAwaitSignal implements Runnable {

    private Lock lock;

    private Condition condition;

    public CustomerAwaitSignal(Lock lock) {
        this.lock = lock;

        condition = lock.newCondition();
    }


    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if ("".equals(Value.value)) {
                    condition.await();
                } else {
                    System.out.println(Thread.currentThread().getName() + " 吃完 " + Value.value);
                    Value.value = "";
                    condition.signalAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
