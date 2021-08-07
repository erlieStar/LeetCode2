package com.javashitang.linkedList._23;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-06
 */
public class SolutionTest {

    @Test
    public void mergeKLists() {
        Solution solution = new Solution();

        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);

        ListNode node2 = new ListNode(2, null);
        ListNode node1 = new ListNode(1, node2);

        ListNode[] listNodes = new ListNode[2];
        listNodes[0] = node3;
        listNodes[1] = node1;
        ListNode listNode = solution.mergeKLists(listNodes);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }


    @Test
    public void mergeKLists2() {
        Solution solution = new Solution();

        ListNode[] listNodes = new ListNode[2];
        listNodes[0] = null;
        listNodes[1] = null;
        ListNode listNode = solution.mergeKLists(listNodes);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}