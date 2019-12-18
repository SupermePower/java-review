package cn.com.nb.thread;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/4 下午6:31
 */
public class ReentryLockDemo {

    static int number = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new ReentryLockLocal());
        Thread t2 = new Thread(new ReentryLockLocal());
        t1.start();
        t2.start();
    }

    static class ReentryLockLocal implements Runnable {

        @Override
        public void run() {
            add();
        }

        private void add() {
            number++;
        }
    }
}
