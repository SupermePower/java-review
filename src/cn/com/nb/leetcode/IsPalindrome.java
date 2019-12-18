package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2019/11/3 下午8:27
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    /**
     * 是否是回文串
     *
     * @param s 参数
     * @return 判断结果
     */
    private static boolean isPalindrome(String s) {
        String[] split = s.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]", "").split("");
        for (int i = 0; i < split.length / 2; i++) {
            if (!split[i].equalsIgnoreCase(split[split.length - (i + 1)])) return false;
        }
        return true;
    }
}
