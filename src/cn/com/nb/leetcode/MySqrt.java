package cn.com.nb.leetcode;

/**
 * @description: 获取平方根
 * @author: GOD
 * @date: 2019/10/7 上午11:42
 */
public class MySqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(81));
        System.out.println(Integer.MAX_VALUE);
    }

    private static int mySqrt(int x) {
        for (int i = 0; true; i++) {
            if (i * i == x) return i;
            if (i * i > x) return i - 1;
        }
    }
}
