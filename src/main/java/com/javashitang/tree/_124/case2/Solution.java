package com.javashitang.tree._124.case2;

/**
 * @author lilimin
 * @since 2021-06-24
 */
class Solution {

    int max;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        max = root.val;
        postOrder(root);
        return max;
    }

    public int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(postOrder(root.left), 0);
        int right = Math.max(postOrder(root.right), 0);
        int value = root.val + left + right;
        max = Math.max(max, value);
        return Math.max(left, right) + root.val;
    }
}
