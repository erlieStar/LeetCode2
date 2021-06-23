package com.javashitang.linkedList._141.case3;


import java.util.HashMap;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-06-22
 * 环形链表
 */
class Solution {

    public boolean hasCycle(ListNode head) {
        Map<ListNode, Boolean> listNodeMap = new HashMap();
        while (head != null) {
            if (listNodeMap.containsKey(head)) {
                return true;
            }
            listNodeMap.put(head, null);
            head = head.next;
        }
        return false;
    }

}
