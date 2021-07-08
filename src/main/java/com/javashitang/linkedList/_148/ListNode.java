package com.javashitang.linkedList._148;

/**
 * @author lilimin
 * @since 2021-06-22
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }
}
