package com.javashitang.tree._124;

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
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int value = root.val;
        if (left > 0) {
            value += left;
        }
        if (right > 0) {
            value += right;
        }
        max = Math.max(max, value);
        return Math.max(0, Math.max(left, right)) + root.val;
    }
}
