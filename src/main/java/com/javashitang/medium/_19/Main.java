package com.javashitang.medium._19;

public class Main {

    public static void main(String[] args) {
        test2();
    }



    public static void test1() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        Solution solution = new Solution();
        ListNode startNode = solution.removeNthFromEnd(listNode1, 4);
        while (startNode.next != null) {
            System.out.println(startNode.val);
            startNode = startNode.next;
        }
        System.out.println(startNode.val);
    }

    public static void test2() {
        ListNode listNode1 = new ListNode(1);
        Solution solution = new Solution();
        ListNode startNode = solution.removeNthFromEnd(listNode1, 1);
        if (startNode != null) {
            while (startNode.next != null) {
                System.out.println(startNode.val);
                startNode = startNode.next;
            }
            System.out.println(startNode.val);
        }
    }
}
