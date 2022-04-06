package com.javashitang.medium._113;

import com.javashitang.hard._145.TreeNode;
import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testPathSum() {
        Solution solution = new Solution();
        TreeNode left = new TreeNode(2, null, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, left, right);
        System.out.println(solution.pathSum(root, 5));
    }
}