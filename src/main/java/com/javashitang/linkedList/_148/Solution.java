package com.javashitang.linkedList._148;

import java.util.ArrayList;
import java.util.Arrays;
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
        ListNode temp = new ListNode();
        ListNode preHead = temp;
        for (Integer item : resultList) {
            ListNode listNode = new ListNode(item);
            temp.next = listNode;
            temp = temp.next;
        }
        return preHead.next;
    }
}
