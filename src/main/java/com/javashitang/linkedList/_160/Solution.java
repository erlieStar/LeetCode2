package com.javashitang.linkedList._160;

/**
 * @author lilimin
 * @since 2021-08-01
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        boolean flagA = true;
        boolean flagB = true;
        ListNode tempB = headB;
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
            if (headA == null && flagA) {
                flagA = false;
                headA = tempB;
            }
            if (headB == null && flagB) {
                flagB = false;
                headB = tempA;
            }
        }
        return null;
    }
}
