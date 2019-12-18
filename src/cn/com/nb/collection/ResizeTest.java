package cn.com.nb.collection;

import java.util.HashMap;

/**
 * @description:
 * @author: GOD
 * @date: 2019/10/7 下午7:55
 */
public class ResizeTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(1, 1);
        map.put("a", "A");
        System.out.println(map);
        map.put("b", "B");
        System.out.println(map);
        map.put("c", "C");
        System.out.println(map);
    }
}
