package com.javashitang.tree._538;

import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-30
 */
public class SolutionTest {


    @Test
    public void convertBST() {
        TreeNode leftNode = new TreeNode(0, null, null);
        TreeNode rightNode = new TreeNode(2, null, null);
        TreeNode rootNode = new TreeNode(1, leftNode, rightNode);
        Solution solution = new Solution();
        solution.convertBST(rootNode);
    }

}