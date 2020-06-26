package com.javashitang.medium._19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        // 走在前面的指针
        ListNode firstNode = newHead;
        // 走在后面的指针
        ListNode secondNode = newHead;
        int start = 0;
        while (start < n + 1) {
            firstNode = firstNode.next;
            start++;
        }
        while (firstNode != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = secondNode.next.next;
        return newHead.next;
    }
}
