package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2019/9/15 下午1:40
 */
public class Divide {

    public static void main(String[] args) {
        System.out.println(divide2(7, -3));
    }

    private static int divide(int dividend, int divisor) {
        boolean isRun = true;
        int i = 0, temp = dividend;
        while (isRun) {
            temp = temp - divisor;
            if (temp > 0) {
                i++;
            } else {
                isRun = false;
            }
        }
        return i;
    }

    private static int divide2(int dividend, int divisor) {
        boolean isRun = true;
        int i = 0, temp;
        while (isRun) {
            temp = divisor + divisor;
            if (0 - temp > dividend) {
                i++;
            } else {
                isRun = false;
            }
        }
        return i;
    }
}
