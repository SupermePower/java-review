package cn.com.nb.leetcode;

/**
 * @description: 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @author: GOD
 * @date: 2019/12/18 下午3:42
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }

    private static int climbStairs(int n) {
        if (n <= 2) return n;
        int current = 1, next = 2, result = 0;
        for (int i = 3; i <= n; i++) {
            result = current + next;
            current = next;
            next = result;
        }
        return result;
    }
}
