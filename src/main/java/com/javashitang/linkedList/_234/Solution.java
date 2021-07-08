package com.javashitang.linkedList._234;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-04
 */
class Solution {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
