package com.javashitang.linkedList._141.case3;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-06-23
 */
public class SolutionTest {

    @Test
    public void hasCycle() {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        Solution solution = new Solution();
        System.out.println(solution.hasCycle(listNode1));
    }

    @Test
    public void hasCycle2() {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);
        listNode2.setNext(listNode1);

        Solution solution = new Solution();
        System.out.println(solution.hasCycle(listNode1));
    }
}