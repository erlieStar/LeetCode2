package com.javashitang.linkedList._5;


/**
 * @author lilimin
 * @since 2021-06-22
 * 反转链表
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode newHead = new ListNode();
        while (head != null) {
            ListNode curNode = head;
            head = head.next;
            curNode.next = newHead.next;
            newHead.next = curNode;
        }
        return newHead.next;
    }
}
