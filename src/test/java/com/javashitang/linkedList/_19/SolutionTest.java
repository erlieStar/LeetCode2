package com.javashitang.linkedList._19;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-06-22
 */
public class SolutionTest {

    @Test
    public void removeNthFromEnd() {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        Solution solution = new Solution();
        ListNode listNode = solution.removeNthFromEnd(listNode1, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    @Test
    public void test() {
        ListNode listNode1 = new ListNode(1, null);
        Solution solution = new Solution();
        ListNode listNode = solution.removeNthFromEnd(listNode1, 1);
        System.out.println(listNode);
    }
}