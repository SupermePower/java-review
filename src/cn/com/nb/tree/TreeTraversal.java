package cn.com.nb.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: GOD
 * @date: 2019/12/30 下午11:15
 */
public class TreeTraversal {

    private static List<Integer> treeValue = new ArrayList<>();

    public static void main(String[] args) {
        preOrder(getTreeNode());
        for (int value : treeValue) {
            System.out.print(value + "\t");
        }
    }

    /**
     * 递归方式前序遍历
     *
     * @param treeNode 树
     */
    private static void preOrderRe(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        preOrderRe(treeNode.left);
        treeValue.add(treeNode.val);
        preOrderRe(treeNode.right);
    }

    /**
     * 前序遍历
     *
     * @param treeNode 树
     */
    private static void preOrder(TreeNode treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || treeNode != null) {
            while (treeNode != null) {
                System.out.print(treeNode.val + "\t");
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            if (!stack.empty()) {
                treeNode = stack.pop();
                treeNode = treeNode.right;
            }
        }
    }

    /**
     * 获取树
     *
     * @return 树
     */
    private static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);

        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(5);

        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(9);

        treeNode.left.left.left = new TreeNode(1);
        treeNode.left.left.right = new TreeNode(3);
        return treeNode;
    }
}
