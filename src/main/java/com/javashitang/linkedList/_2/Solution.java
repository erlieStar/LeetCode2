package com.javashitang.linkedList._2;


/**
 * @author lilimin
 * @since 2021-06-25
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        getSum(l1, l2, root);
        return root;
    }

    public void getSum(ListNode l1, ListNode l2, ListNode root) {
        if (l1 == null || l2 == null) {
            return;
        }

    }
}
