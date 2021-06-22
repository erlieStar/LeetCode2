package com.javashitang.linkedList._6;

/**
 * @author lilimin
 * @since 2021-06-22
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode();
        ListNode tempHead = newHead;
        while (head != null) {
            if (head.val != val) {
                tempHead.next = head;
                tempHead = tempHead.next;
            } else {
                tempHead.next = null;
            }
            head = head.next;
        }
        return newHead.next;
    }
}
