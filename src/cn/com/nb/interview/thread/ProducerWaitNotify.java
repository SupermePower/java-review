package cn.com.nb.interview.thread;

import java.util.Random;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/23 下午2:13
 */
public class ProducerWaitNotify implements Runnable {

    private final LockObject lock;

    public ProducerWaitNotify(LockObject lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    if (!"".equals(Value.value)) {
                        lock.wait();
                    } else {
                        Thread.sleep(1000);
                        Value.value = "大饼";
                        System.out.println("生产的消息为：" + Value.value);
                        lock.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
