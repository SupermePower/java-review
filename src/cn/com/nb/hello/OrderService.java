package cn.com.nb.hello;

/**
 * @description
 * @author: liying.fu
 * @Date: 2018/11/25 下午2:27
 */
public interface OrderService {

    void print();

    default void println() {
        System.out.println("default print data...");
    }
}
