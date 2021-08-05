package com.javashitang.tree._124;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-05
 */
public class SolutionTest {

    @Test
    public void maxPathSum() {
        Solution solution = new Solution();
        TreeNode leftNode = new TreeNode(-2, null, null);
        TreeNode rightNode = new TreeNode(3, null, null);
        TreeNode treeNode = new TreeNode(1, leftNode, rightNode);
        int value = solution.maxPathSum(treeNode);
        System.out.println(value);
    }
}