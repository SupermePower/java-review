package cn.com.nb.interview.juc;


import java.math.BigDecimal;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/23 上午11:40
 */
public class CollectionTest {


    public static void main(String[] args) {

    //CopyOnWriteArrayList
    //CopyOnWriteArraySet
    //ConcurrentHashMap
        // ArrayList 底层Object数组
        // HashSet 底层 HashMap
        // HashMap  底层 数组+链表+红黑树（泊松分布）

        BigDecimal d = new BigDecimal("1");
        System.out.println(d.subtract(new BigDecimal(0.9)));
    }


}
