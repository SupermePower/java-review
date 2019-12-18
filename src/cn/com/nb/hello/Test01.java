package cn.com.nb.hello;

import java.util.HashSet;
import java.util.Set;

/**
 * @description
 * @author: liying.fu
 * @Date: 2018/11/25 下午2:29
 */
public class Test01 {
    public static void main(String[] args) {
        int i = 123;
        int g = 123 % 10;
        int s = (i - g) % 100 / 10;
        int b = (i - (i % 100)) % 1000 /100;
        System.out.println(g);
        System.out.println(s);
        System.out.println(b);
    }

    private static int array() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return (i + 1);
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++) {
            /**
             * 第一次] num : 4
             * 第二次] num : 5
             * 第三次] num : 7
             * 第四次] num : 6
             * 第五次] num : 4
             *
             */
            num ^= nums[i];
        }
        return num;
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for (char c : chars) {
            characterSet.add(c);
        }
        return characterSet.size();
    }
}