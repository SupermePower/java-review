package cn.com.nb.hello;


public class HelloWord {


    public static void main(String[] args) {
        int threadName = 0;
        while (true) {
            Runnable t1 = new Ticket();
            new Thread(t1, "窗口 -> " + threadName).start();
            threadName++;
        }
    }
}
