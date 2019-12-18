package cn.com.nb.interview.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/23 下午2:36
 */
public class ThreadCommunicationTest {

    public static void main(String[] args) {
        awaitAndSignal();
    }

    private static void waitAndNotifyTest() {
        LockObject lock = new LockObject();
        Thread producer = new Thread(new ProducerWaitNotify(lock));
        producer.start();
        Thread customerA = new Thread(new CustomerWaitNotify(lock), "A");
        customerA.start();
        Thread customerB = new Thread(new CustomerWaitNotify(lock), "B");
        customerB.start();
    }

    private static void awaitAndSignal() {
        Lock lock = new ReentrantLock();
        Thread producer = new Thread(new ProducerAwaitSignal(lock), "厨师");
        producer.start();

        Thread customer = new Thread(new CustomerAwaitSignal(lock), "A");
        customer.start();
    }
}
