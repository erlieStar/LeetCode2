package com.javashitang.tree._114;

import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-02
 */
public class SolutionTest {

    @Test
    public void flatten() {

        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2, node3, node4);

        TreeNode node6 = new TreeNode(6);
        TreeNode node5 = new TreeNode(5, null,  node6);

        TreeNode node1 = new TreeNode(1, node2, node5);

        Solution solution = new Solution();
        solution.flatten(node1);

        System.out.println(node1);
    }
}