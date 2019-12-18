package cn.com.nb.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {

    private static AtomicInteger number = new AtomicInteger(0);

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new ThreadAddNumber());
        Thread t2 = new Thread(new ThreadAddNumber());
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {}
        System.out.println(number.get());

        ConcurrentMap<String, Object> map = new ConcurrentHashMap<>();
        map.putIfAbsent("code", 1);
        map.put("name", "Tome");

        Map<String, Object> param = new HashMap<>();
    }

    static class ThreadAddNumber implements Runnable {
        @Override
        public void run() {
            add();
        }

        public void add() {
            for (int i = 0; i < 10000000; i++) {
                number.getAndAdd(1);
            }
        }
    }
}
