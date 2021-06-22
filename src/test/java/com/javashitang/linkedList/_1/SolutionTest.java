package com.javashitang.linkedList._1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-22
 */
public class SolutionTest {

    @Test
    public void hasCycle() {
        ListNode a = null;
        ListNode b = null;
        if (a == b) {
            System.out.println("yes");
        }

        ListNode listNode = new ListNode(1);
        Solution solution = new Solution();
        System.out.println(solution.hasCycle(listNode));
    }
}