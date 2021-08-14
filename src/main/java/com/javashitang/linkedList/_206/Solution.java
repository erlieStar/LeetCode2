package com.javashitang.linkedList._206;


/**
 * @author lilimin
 * @since 2021-06-22
 * 反转链表
 */
class Solution {

    public ListNode reverseList(ListNode head) {
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
