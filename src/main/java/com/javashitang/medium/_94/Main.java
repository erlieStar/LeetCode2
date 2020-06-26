package com.javashitang.medium._94;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

//    [1, 3, 2]
    public static void test1() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        Solution solution = new Solution();
        List<Integer> list = solution.inorderTraversal(node1);
        System.out.println(list.toString());
    }

//    [3, 1, 2]
    public static void test2() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, node3, node2);
        Solution solution = new Solution();
        List<Integer> list = solution.inorderTraversal(node1);
        System.out.println(list.toString());
    }


//    [1, 4, 3, 2]
    public static void test3() {
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node3 = new TreeNode(3, node4, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);
        Solution2 solution = new Solution2();
        List<Integer> list = solution.inorderTraversal(node1);
        System.out.println(list.toString());
    }

    public static void test4() {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, node3, node2);
        Solution2 solution = new Solution2();
        List<Integer> list = solution.inorderTraversal(node1);
        System.out.println(list.toString());
    }
}
