package cn.com.nb.leetcode;

/**
 * @description:
 * @author: GOD
 * @date: 2020/1/5 上午12:29
 */
public class SwapPairs {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);

        System.out.println(node);
    }

    public static ListNode swapPairs(ListNode head) {
        return null;
    }
}


class ListNode {
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}