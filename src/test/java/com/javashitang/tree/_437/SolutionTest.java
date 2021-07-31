package com.javashitang.tree._437;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-31
 */
public class SolutionTest {

    @Test
    public void pathSum() {
        TreeNode node43 = new TreeNode(3);
        TreeNode node42 = new TreeNode(-2);
        TreeNode node33 = new TreeNode(3, node43, node42);
        TreeNode node41 = new TreeNode(1);
        TreeNode node32 = new TreeNode(2, null, node41);
        TreeNode node25 = new TreeNode(5, node33, node32);

        TreeNode node311 = new TreeNode(11);
        TreeNode node23 = new TreeNode(-3, null, node311);

        TreeNode rootNode = new TreeNode(10, node25, node23);
        Solution solution = new Solution();
        int count = solution.pathSum(rootNode, 8);
        System.out.println(count);
    }
}