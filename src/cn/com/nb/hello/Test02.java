package cn.com.nb.hello;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * @author: GOD
 * @date: 2019/6/25 下午9:00
 */
public class Test02 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE/1000/3600/24);
        int[] s = {1, 2, 3, 4, 2, 6, 7};
        Arrays.sort(s);
        boolean result = containsDuplicate(s);
        System.out.println(result);
    }

    private static void singleNum() {
        int[] nums = {3, 3, 4, 1, 2, 1, 2};
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        System.out.println(num);
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }

        for (char c : s) {
            System.out.print(c);
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int sameTimes = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) continue;
                if (++sameTimes >= 2) return true;
            }

        }
        return false;
    }
}
