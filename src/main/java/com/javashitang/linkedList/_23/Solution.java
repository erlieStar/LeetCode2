package com.javashitang.linkedList._23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-08-06
 */
class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        List<Integer> nums = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                nums.add(node.val);
                node = node.next;
            }
        }
        if (nums.size() == 0) {
            return null;
        }
        Collections.sort(nums);
        ListNode tail = new ListNode(nums.get(nums.size() - 1));
        ListNode head = tail;
        for (int i = nums.size() - 2; i >= 0 ; i--) {
            ListNode temp = new ListNode(nums.get(i), tail);
            tail = temp;
            head = temp;
        }
        return head;
    }
}
