package com.javashitang.linkedList._141;

/**
 * @author lilimin
 * @since 2021-06-22
 * 环形链表
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        do {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
        } while (fast != null && fast.next != slow.next);
        if (fast == null) {
            return false;
        }
        return true;
    }

}
