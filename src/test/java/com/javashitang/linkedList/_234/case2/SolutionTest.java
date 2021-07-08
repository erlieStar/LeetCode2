package com.javashitang.linkedList._234.case2;

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
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        System.out.println(solution.isPalindrome(listNode1));
    }

    @Test
    public void isPalindrome2() {
        Solution solution = new Solution();
        ListNode listNode4 = new ListNode(1, null);
        ListNode listNode3 = new ListNode(2, listNode4);
        System.out.println(solution.isPalindrome(listNode3));
    }

    @Test
    public void isPalindrome7() {
        Solution solution = new Solution();
        ListNode listNode4 = new ListNode(1, null);
        ListNode listNode3 = new ListNode(1, listNode4);
        System.out.println(solution.isPalindrome(listNode3));
    }

    @Test
    public void isPalindrome3() {
        Solution solution = new Solution();
        ListNode listNode4 = new ListNode(1, null);
        System.out.println(solution.isPalindrome(listNode4));
    }

    @Test
    public void isPalindrome4() {
        Solution solution = new Solution();
        ListNode listNode4 = new ListNode(0, null);
        ListNode listNode3 = new ListNode(0, listNode4);
        ListNode listNode2 = new ListNode(1, listNode3);
        System.out.println(solution.isPalindrome(listNode2));
    }

    @Test
    public void isPalindrome5() {
        Solution solution = new Solution();
        ListNode listNode4 = new ListNode(0, null);
        ListNode listNode3 = new ListNode(1, listNode4);
        ListNode listNode2 = new ListNode(0, listNode3);
        System.out.println(solution.isPalindrome(listNode2));
    }
}