package com.javashitang.linkedList._6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-22
 */
public class SolutionTest {

    @Test
    public void removeElements() {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(5, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        Solution solution = new Solution();
        ListNode listNode = solution.removeElements(listNode1, 5);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    public void removeElementsCase2() {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(5, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        Solution solution = new Solution();
        ListNode listNode = solution.removeElements(listNode1, 3);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}