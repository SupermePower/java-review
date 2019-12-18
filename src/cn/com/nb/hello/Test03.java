package cn.com.nb.hello;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: GOD
 * @date: 2019/10/30 下午10:47
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(5));
    }

    private static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int temp = 1;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            temp = temp * 2;
            if (temp == n) {
                return true;
            }
            if (temp > n) {
                return false;
            }
        }
        return false;
    }
}
