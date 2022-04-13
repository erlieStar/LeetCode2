package com.javashitang.Interview._02_04;

import com.javashitang.easy._21.ListNode;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testPartition() {
        ListNode node_1 = new ListNode(1, null);
        ListNode node_2 = new ListNode(2, node_1);
        Solution solution = new Solution();
        ListNode head = solution.partition(node_2, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public void testPartition2() {
        ListNode node_2 = new ListNode(2, null);
        ListNode node_5 = new ListNode(5, node_2);
        ListNode node_2_2 = new ListNode(2, node_5);
        ListNode node_3 = new ListNode(3, node_2_2);
        ListNode node_4 = new ListNode(4, node_3);
        ListNode node_1 = new ListNode(1, node_4);
        Solution solution = new Solution();
        ListNode head = solution.partition(node_1, 3);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}