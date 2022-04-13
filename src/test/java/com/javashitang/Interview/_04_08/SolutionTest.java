package com.javashitang.Interview._04_08;

import com.javashitang.hard._145.TreeNode;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testLowestCommonAncestor() {
        Solution solution = new Solution();
        TreeNode node_7 = new TreeNode(7, null, null);
        TreeNode node_4 = new TreeNode(4, null, null);
        TreeNode node_6 = new TreeNode(6, null, null);
        TreeNode node_2 = new TreeNode(2, node_7, node_4);
        TreeNode node_0 = new TreeNode(0, null, null);
        TreeNode node_8 = new TreeNode(8 , null, null);
        TreeNode node_5 = new TreeNode(5, node_6, node_2);
        TreeNode node_1 = new TreeNode(1, node_0, node_8);
        TreeNode node_3 = new TreeNode(3, node_5, node_1);
        TreeNode treeNode = solution.lowestCommonAncestor(node_3, node_5, node_1);
        System.out.println(treeNode.val);
    }
}