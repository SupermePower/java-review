package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/11 下午12:09
 */
public class SumZero {

    public static void main(String[] args) {
        sumZero(5);
    }

    private static int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[i] = 1;
        }
        result[n - 1] = - (n -1);
        return result;
    }
}
