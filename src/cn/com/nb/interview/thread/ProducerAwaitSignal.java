package cn.com.nb.interview.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/23 下午8:55
 */
public class ProducerAwaitSignal implements Runnable {

    private Lock lock;

    private Condition condition;

    public ProducerAwaitSignal(Lock lock) {
        this.lock = lock;

        condition = lock.newCondition();
    }


    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (!"".equals(Value.value)) {
                    condition.await();
                } else {
                    Thread.sleep(2000);
                    Value.value = "米饭";
                    System.out.println(Thread.currentThread().getName() + " 做 " + Value.value);
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
