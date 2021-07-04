package com.javashitang.linkedList._234;

/**
 * @author lilimin
 * @since 2021-07-04
 */
class Solution {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next == null ? fast.next : fast.next.next;
        }
        return true;
    }
}
