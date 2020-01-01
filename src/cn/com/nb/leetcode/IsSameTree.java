package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2019/12/29 上午1:03
 */
public class IsSameTree {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(1);
        p.right = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        boolean sameTree = isSameTree(p, q);
        System.out.println(sameTree);

    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || p != null && q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}