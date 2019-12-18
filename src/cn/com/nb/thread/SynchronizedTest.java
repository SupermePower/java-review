package cn.com.nb.thread;

/**
 * @description: 对象，类
 * @author: GOD
 * @date: 2019/11/4 上午11:30
 */
public class SynchronizedTest {

    static int number = 0;

    static final Object lock = new Object();

    public static void main(String[] args) throws Exception {
        ThreadDemoLocal threadDemoLocal = new ThreadDemoLocal();
        Thread t1 = new Thread(threadDemoLocal);
        Thread t2 = new Thread(new ThreadDemoLocal());

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(number);
    }


    static class ThreadDemoLocal implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                add();
            }
        }

        public void add() {
            synchronized (ThreadDemoLocal.class) {
                number++;
            }
        }
    }

}
