package com.javashitang.linkedList._21;

/**
 * @author lilimin
 * @since 2021-07-04
 * 合并2个有序链表
 */
class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode();
        ListNode tempDummy = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        // l1链表遍历完了，把l2剩余的节点加上去
        if (l1 == null) {
            dummy.next = l2;
        }
        // l2链表遍历完了，把l1剩余的节点加上去
        if (l2 == null) {
            dummy.next = l1;
        }
        return tempDummy.next;
    }
}
