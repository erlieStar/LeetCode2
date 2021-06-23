package com.javashitang.linkedList._19;

/**
 * @author lilimin
 * @since 2021-06-22
 */
class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempHead = head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return tempHead;
    }
}
