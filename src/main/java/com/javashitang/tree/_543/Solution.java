package com.javashitang.tree._543;

/**
 * @author lilimin
 * @since 2021-07-30
 */
class Solution {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        postOrder(root);
        return max - 1;
    }

    public int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        int value = 1 + left + right;
        max = Math.max(value, max);
        return 1 + Math.max(left, right);
    }
}