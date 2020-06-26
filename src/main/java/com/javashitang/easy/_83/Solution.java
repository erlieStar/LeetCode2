package com.javashitang.easy._83;

public class Solution {
    //删除链表中重复元素
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head.next = head.next.next;
            }
            head = head.next;
        }
        return start;
    }
}
