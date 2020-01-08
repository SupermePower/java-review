package cn.com.nb.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/8 下午11:05
 */
public class YangHui {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int[][] array = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> element = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
                element.add(array[i][j]);
            }
            result.add(element);
        }
        return result;
    }
}
