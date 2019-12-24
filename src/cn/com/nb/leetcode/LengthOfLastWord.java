package cn.com.nb.leetcode;

/**
 * @description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * @author: GOD
 * @date: 2019/12/24 下午10:43
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(lengthOfLastWord(word));
    }

    private static int lengthOfLastWord(String s) {
        if (s == null || "".equals(s.trim())) return 0;
        String[] sArray = s.split(" ");
        return sArray[sArray.length - 1].length();
    }
}
