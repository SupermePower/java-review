package cn.com.nb.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/9 上午11:37
 */
public class MajorityElement {

    public static void main(String[] args) {
        int majorityElement = majorityElement(new int[]{3,3,4});
        System.out.println(majorityElement);
    }

    /**
     * 获取众数
     *
     * @param nums 数组
     * @return 众数
     */
    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxValue = map.values().stream().max(Comparator.comparingInt(Integer::intValue)).get();
        for (int i : map.keySet()) {
            if (map.get(i) == maxValue) {
                return i;
            }
        }
        return 0;
    }
}
