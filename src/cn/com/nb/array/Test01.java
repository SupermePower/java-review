package cn.com.nb.array;

import cn.com.nb.domain.Demo;

import java.math.BigDecimal;

public class Test01 {

    public static void main(String[] args) {
        BigDecimal totalCharge = new BigDecimal("902432.53245");
        BigDecimal payOrderAmount = new BigDecimal("-122.5");
        System.out.println(totalCharge.toString());
        System.out.println(totalCharge.compareTo(payOrderAmount));
    }

    private static int testInt(int i, String s) {
        return 1;
    }

    public static int testMethod(int n) {
        if (n <= 1) {
            return 1;
        }
        return testMethod(n - 1) + testMethod(n - 2);
    }


    public static int testMethod2(int n) {
        int a = 1, b = 1, c = 0, i = 1;
        while (i < n) {
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        return c;
    }

    public void testMethod3() {

    }

    public static Integer testInt() {
        return 1;
    }

    public static int receiveInt(Demo demo) {
        System.out.println(demo);
        return 1;
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        String temp = "";
        int length = Math.min(nums1.length, nums2.length);
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    temp = temp.concat(num1 + ",");
                }
            }
        }
        temp = temp.substring(0, temp.length() - 1);
        String[] split = temp.split(",");
        int[] result = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            result[i] = Integer.parseInt(split[i]);
        }
        return result;
    }

    /**
     * 将数组中数值为0的元素移动到尾端，并保证原🈶顺序
     * @param nums
     */
    public static void moveZeroes(int[] nums) {

    }
}
