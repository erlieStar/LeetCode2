package com.javashitang.linkedList._206.case2;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-06-22
 * 反转链表
 */
class Solution {

    public ListNode reverseList(ListNode head) {
        List<Integer> nums = new ArrayList<>();
        while (head != null) {
            nums.add(head.val);
        }
        ListNode dummy = new ListNode();
        for (int i = nums.size() - 1; i >= 0 ; i--) {
            dummy.next = new ListNode(nums.get(i));
            dummy = dummy.next;
        }
        return dummy.next;
    }
}
