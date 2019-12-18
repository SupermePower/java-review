package cn.com.nb.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/4/14 下午7:57
 */
public class Add {

    private static AtomicInteger number = new AtomicInteger(0);


    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new AddNum());
        Thread t2 = new Thread(new AddNum());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(number.get());
    }


    static class AddNum implements Runnable {

        @Override
        public void run() {
            add();
        }

        public final void add() {
            for (int i = 0; i < 10000; i++) {
                number.incrementAndGet();
            }
        }
    }
}
