package cn.com.nb.interview.DesignPatterns.singleton;

/**
 * @description:
 * @author: GOD
 * @date: 2019/12/14 下午11:30
 */
public class StaticInternalClassSingleton {

    private StaticInternalClassSingleton() {}

    private static class StaticInternalClass {
        static StaticInternalClassSingleton instance = new StaticInternalClassSingleton();
    }

    public static StaticInternalClassSingleton getInstance() {
        return StaticInternalClass.instance;
    }
}
