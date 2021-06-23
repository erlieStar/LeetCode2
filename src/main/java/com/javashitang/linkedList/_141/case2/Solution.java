package com.javashitang.linkedList._141.case2;


/**
 * @author lilimin
 * @since 2021-06-22
 * 环形链表
 */
class Solution {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
