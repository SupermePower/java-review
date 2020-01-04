package cn.com.nb.factorial;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/4 下午11:59
 */
public class FibonacciSequence {

    public static void main(String[] args) {
        System.out.println(fibonacciSequence(7));
    }

    private static int fibonacciSequence(int n) {
        if (n == 1 || n == 2) {
            return n;
        } else {
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
        }
    }
}
