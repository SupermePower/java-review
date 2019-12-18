package cn.com.nb.interview.DesignPatterns.singleton;

/**
 * @description: 饿汉式
 * @author: GOD
 * @date: 2019/12/14 下午11:28
 */
public class HungryManSingleton {

    private static HungryManSingleton instance = new HungryManSingleton();

    private HungryManSingleton() {}

    public static HungryManSingleton getInstance() {
        return instance;
    }
}
