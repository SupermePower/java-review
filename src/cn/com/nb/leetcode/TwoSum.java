package cn.com.nb.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/3 下午10:24
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    /**
     * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
     * <p>
     * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
     * <p>
     * 说明:
     * <p>
     * 返回的下标值（index1 和 index2）不是从零开始的。
     * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
     *
     * @param numbers
     * @param target
     * @return
     */
    private static int[] twoSum(int[] numbers, int target) {
        long startTime = System.currentTimeMillis();
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int number : numbers) {
            if (!map.containsKey(number)) {
                map.put(target - number, index);
                index++;
                continue;
            }
            result[0] = map.get(number) + 1;
            result[1] = ++index;
            System.out.println(System.currentTimeMillis() - startTime);
            return result;
        }
        return result;
    }

    private static int[] twoSum2(int[] numbers, int target) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if ((numbers[i] + numbers[j]) == target) {
                    System.out.println(System.currentTimeMillis() - startTime);
                    return new int[]{j, j + 1};
                }
            }
        }
        return null;
    }
}
