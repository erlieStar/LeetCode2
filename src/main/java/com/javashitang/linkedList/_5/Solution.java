package com.javashitang.linkedList._5;


/**
 * @author lilimin
 * @since 2021-06-22
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode preHead = head;
        while (head.next != null) {
            ListNode nextNode = head.next;
            if (head.next.next != null) {
                ListNode nextMove = head.next.next;
                head.next = nextMove;
            }
            preHead.next = nextNode;
            nextNode.next = head;
        }
        return preHead.next;
    }
}
