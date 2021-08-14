package com.javashitang.linkedList._206.case2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-14
 */
public class SolutionTest {

    @Test
    public void reverseList() {
        Solution solution = new Solution();
        ListNode listNode = solution.reverseList(null);
        System.out.println(listNode);
    }
}