package cn.com.nb.interview.DesignPatterns.singleton;

/**
 * @description: 懒汉是单例模式
 * @author: GOD
 * @date: 2019/12/14 下午11:19
 */
public class LazyManSingleton {

    private static LazyManSingleton singleton;

    private LazyManSingleton() {}

    public static LazyManSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazyManSingleton();
        }
        return singleton;
    }
}
