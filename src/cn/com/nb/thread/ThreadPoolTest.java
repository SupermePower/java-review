package cn.com.nb.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/3/3 下午10:30
 */
public class ThreadPoolTest {

    private static LinkedBlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(6);


    // 默认的饱和策略（直接拒绝并抛出异常）
    private static RejectedExecutionHandler rejectedExecutionHandler = new ThreadPoolExecutor.AbortPolicy();

    private final static int coreSize = 1;

    private final static int maxSize = 3;

    private final static int aliveTime = 10;

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(coreSize, maxSize, aliveTime, TimeUnit.SECONDS, workQueue, rejectedExecutionHandler);
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
