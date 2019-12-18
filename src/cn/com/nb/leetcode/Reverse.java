package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/19 下午3:41
 * <p>
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    /**
     * 整数反转
     *
     * @param x 原数
     * @return 反转后
     */
    private static int reverse(int x) {
        if (x == 0) return 0;
        String[] split = String.valueOf(x).split("");
        StringBuilder result = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {

            // 如果最后一个为0则直接返回
            if (i == split.length - 1 && (split[split.length - 1]).equals("0")) {
                continue;
            }

            // 如果最后一个为负号
            if (i == 0 && "-".equals(split[0])) {
                result.insert(0, split[0]);
                continue;
            }
            result.append(split[i]);
        }

        try {
            return Integer.parseInt(result.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
