package com.javashitang.linkedList._160.case2;

/**
 * @author lilimin
 * @since 2021-08-01
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (headA != headB) {
            headA = headA == null ? tempB : headA.next;
            headB = headB == null ? tempA : headB.next;
        }
        return headA;
    }
}
