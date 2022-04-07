package com.javashitang.easy._206;

import com.javashitang.easy._21.ListNode;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testReverseList() {
        ListNode listNode = new ListNode(2, null);
        ListNode head = new ListNode(1, listNode);
        Solution solution = new Solution();
        ListNode listNode1 = solution.reverseList(head);
        System.out.println();
    }
}