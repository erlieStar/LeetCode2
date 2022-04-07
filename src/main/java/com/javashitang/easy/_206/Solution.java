package com.javashitang.easy._206;

import com.javashitang.easy._21.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        while (head != null) {
            ListNode curNode = head;
            head = head.next;
            curNode.next = dummy.next;
            dummy.next = curNode;
        }
        return dummy.next;
    }
}
