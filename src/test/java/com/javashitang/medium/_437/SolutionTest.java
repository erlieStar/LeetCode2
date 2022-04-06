package com.javashitang.medium._437;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testPathSum() {
        Solution solution = new Solution();
        TreeNode __41 = new TreeNode(3, null, null);
        TreeNode __42 = new TreeNode(-2, null, null);
        TreeNode __43 = new TreeNode(1, null, null);

        TreeNode __31 = new TreeNode(3, __41, __42);
        TreeNode __32 = new TreeNode(2, null, __43);
        TreeNode __33 = new TreeNode(11, null, null);


        TreeNode __21 = new TreeNode(5, __31, __32);
        TreeNode __22 = new TreeNode(-3, null, __33);
        TreeNode __11 = new TreeNode(10, __21, __22);

        System.out.println(solution.pathSum(__11, 8));
    }
}