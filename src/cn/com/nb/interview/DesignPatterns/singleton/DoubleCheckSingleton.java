package cn.com.nb.interview.DesignPatterns.singleton;

/**
 * @description: 双重校验
 * @author: GOD
 * @date: 2019/12/14 下午11:40
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized(DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
