package com.javashitang.linkedList._234.case2;


/**
 * @author lilimin
 * @since 2021-07-04
 */
class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode pre = new ListNode();
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            ListNode node = new ListNode(slow.val, pre.next);
            pre.next = node;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        pre = pre.next;
        while (slow != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
}
