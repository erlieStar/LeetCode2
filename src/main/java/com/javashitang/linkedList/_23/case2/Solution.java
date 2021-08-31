package com.javashitang.linkedList._23.case2;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lilimin
 * @since 2021-08-06
 */
class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        Queue<ListNode> queue = new PriorityQueue<>((node1, node2) -> node1.val - node2.val);
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        ListNode dummy = new ListNode();
        ListNode tempDummy = dummy;
        while (!queue.isEmpty()) {
            ListNode poll = queue.poll();
            tempDummy.next = poll;
            tempDummy = poll;
            if (poll.next != null) {
                queue.add(poll.next);
            }
        }
        return dummy.next;
    }
}
