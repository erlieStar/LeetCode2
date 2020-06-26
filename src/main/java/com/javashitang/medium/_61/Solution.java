package com.javashitang.medium._61;

public class Solution {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode headNode = head;
        ListNode tailNode = head;
        ListNode tempNode = head;
        while (tempNode != null) {
            tailNode = tempNode;
            tempNode = tempNode.next;
            length++;
        }
        k = k % length;
        if (k == 0) {
            return headNode;
        }
        tailNode.next = headNode;
        tempNode = head;
        for (int i = 0; i < length - k - 1; i++) {
            tempNode = tempNode.next;
        }
        ListNode newHeadNode = tempNode.next;
        tempNode.next = null;
        return newHeadNode;
    }

}
