package cn.com.nb.thread;

public class ThreadDemo implements Runnable {

    @Override
    public void run() {
        this.executeThread();
    }

    private void executeThread() {
        System.out.println("打印数据 -> {}" + Thread.currentThread().getName());
    }
}
