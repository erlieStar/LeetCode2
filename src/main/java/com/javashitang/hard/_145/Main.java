package com.javashitang.hard._145;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        Solution solution = new Solution();
        List<Integer> list = solution.postorderTraversal(node1);
        System.out.println(list.toString());
    }

    public static void test2() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        Solution2 solution = new Solution2();
        List<Integer> list = solution.postorderTraversal(node1);
        System.out.println(list.toString());
    }
}
