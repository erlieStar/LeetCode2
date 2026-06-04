package com.javashitang.niuke.bm1;

/**
 * @Author lilimin
 * @Date 2026/6/2
 */
public class Solution {

    public ListNode ReverseList (ListNode head) {
        ListNode dummy = new ListNode(0);
        while (head != null) {
            ListNode cur = head;
            head = head.next;
            cur.next = dummy.next;
            dummy.next = cur;
        }
        return dummy.next;
    }
}
