package com.javashitang.linkedList._148.case2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-08
 */
class Solution {

    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> resultList = new ArrayList<>();
        while (head != null) {
            resultList.add(head.val);
            head = head.next;
        }
        Collections.sort(resultList);
        ListNode tempHead = null, newHead = null;
        for (int i = 0; i < resultList.size(); i++) {
            if (i == 0) {
                newHead = new ListNode(resultList.get(i));
                tempHead = newHead;
            } else {
                ListNode listNode = new ListNode(resultList.get(i));
                newHead.next = listNode;
                newHead = newHead.next;
            }
        }
        return tempHead;
    }
}
