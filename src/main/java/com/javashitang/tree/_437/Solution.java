package com.javashitang.tree._437;

/**
 * @author lilimin
 * @since 2021-07-31
 */
class Solution {

    int total = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        inorder(root, targetSum, 0);
        return total;
    }

    public void inorder(TreeNode root, int targetSum, int curSum) {
        if (root == null) {
            return;
        }
        if (curSum + root.val == targetSum) {
            total++;
        }
        inorder(root.left, targetSum, curSum + root.val);
        inorder(root.left, targetSum, 0);
        inorder(root.right, targetSum, curSum + root.val);
        inorder(root.right, targetSum, 0);
    }

}
