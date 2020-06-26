package com.javashitang.easy._83;

public class Main {

    public static void main(String[] args) {
        ListNode node32 = new ListNode(3, null);
        ListNode node31 = new ListNode(3, node32);
        ListNode node22 = new ListNode(2, node31);
        ListNode node21 = new ListNode(2, node22);
        ListNode node12 = new ListNode(1, node21);
        ListNode node11 = new ListNode(1, node12);
        Solution solution = new Solution();
        ListNode start = solution.deleteDuplicates(node11);
        while (start != null) {
            System.out.println(start.val);
            start = start.next;
        }
    }
}
