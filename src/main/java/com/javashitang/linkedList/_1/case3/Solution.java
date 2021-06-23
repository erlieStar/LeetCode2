package com.javashitang.linkedList._1.case3;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-06-22
 * 环形链表
 */
class Solution {

    public boolean hasCycle(ListNode head) {
        List<ListNode> listNodeList = new ArrayList<>();
        while (head != null) {
            if (listNodeList.contains(head)) {
                return true;
            }
            listNodeList.add(head);
            head = head.next;
        }
        return false;
    }

}
