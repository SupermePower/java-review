package cn.com.nb.dg;

import java.util.HashMap;
import java.util.Map;

/**
 * @description
 * @author: liying.fu
 * @Date: 2019/4/10 下午9:47
 */
public class Test {

    static int number = 0;

    public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>(6);
        map.put(null, "name");
        map.put(null, "sex");
        map.put(null, "hello");
        System.out.println(map);
        map();
    }

    private static void test() throws Exception {
        try {
            number++;
            System.out.println(number);
            Thread.sleep(2000);
            if (number <= 3) {
                test();
            }
        } finally {
            System.out.println("finally " + number);
        }
    }

    private static void map() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Tom");
        System.out.println(map);
    }
}
