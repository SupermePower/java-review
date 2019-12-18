package cn.com.nb.interview.thread;


/**
 * @description: 消费者
 * @author: GOD
 * @date: 2019/11/23 下午2:30
 */
public class CustomerWaitNotify implements Runnable {

    private final LockObject lock;

    public CustomerWaitNotify(LockObject lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    if ("".equals(Value.value)) {
                        lock.wait();
                    } else {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName() + " 吃了 " + Value.value);
                        Value.value = "";
                        lock.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}