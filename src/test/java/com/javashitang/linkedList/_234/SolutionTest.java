package com.javashitang.linkedList._234;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-05
 */
public class SolutionTest {

    @Test
    public void isPalindrome() {
        Solution solution = new Solution();
        ListNode listNode4 = new ListNode(1, null);
        ListNode listNode3 = new ListNode(2, listNode4);
        ListNode listNode2 = new ListNode(3, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        System.out.println(solution.isPalindrome(listNode1));
    }
}