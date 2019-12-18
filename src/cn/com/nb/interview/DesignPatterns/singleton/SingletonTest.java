package cn.com.nb.interview.DesignPatterns.singleton;

/**
 * @description:
 * @author: GOD
 * @date: 2019/12/14 下午11:21
 */
public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " -> " +instance);
            }, "Thread " + i).start();
        }
    }
}
