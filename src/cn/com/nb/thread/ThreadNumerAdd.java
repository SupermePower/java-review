package cn.com.nb.thread;

/**
 * @description 多线程新增数据
 * @author: liying.fu
 * @Date: 2019/3/17 下午7:28
 */
public class ThreadNumerAdd implements Runnable{

    private static int a = 0;

    @Override
    public synchronized void run() {
       for (int i = 0; i < 10000000; i++) {
           a ++;
       }
    }

    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(new ThreadNumerAdd(), "线程1");
        Thread thread2 = new Thread(new ThreadNumerAdd(), "线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(a);
    }
}
