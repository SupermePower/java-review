package cn.com.nb.factorial;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/4 下午11:41
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

    /**
     * 递归-阶乘
     *
     * @param i 目标
     */
    private static int recursiveFactorial(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i * recursiveFactorial(i - 1);
        }
    }
}
