package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/10 下午11:52
 */
public class FindNumbers {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num + "").length() % 2 == 0) count++;
        }
        return count;
    }
}
