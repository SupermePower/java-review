package cn.com.nb.interview.jmm;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/14 下午11:11
 */
public class VolatileDemo {

    public static void main(String[] args) {
        VolatileLocal volatileLocal = new VolatileLocal();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            volatileLocal.add();
            System.out.println(volatileLocal.number);
        }, "fly").start();

        while (volatileLocal.number == 0) {

        }
        System.out.println(Thread.currentThread().getName() + " " + volatileLocal.number);
    }
}

class VolatileLocal {
     int number = 0;

    public void add() {
        ++number;
    }
}
