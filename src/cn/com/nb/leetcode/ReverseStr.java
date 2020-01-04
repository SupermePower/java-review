package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/4 下午6:11
 */
public class ReverseStr {

    public static void main(String[] args) {
        String str = "cba";
        char[] chars = str.toCharArray();
        printReverseStr(0, chars);
    }


    private static void printReverseStr(int index, char[] chars) {
        if (chars == null || index > chars.length - 1) return;

        printReverseStr(index + 1, chars);

        System.out.print(chars[index] + "\t");
    }
}
