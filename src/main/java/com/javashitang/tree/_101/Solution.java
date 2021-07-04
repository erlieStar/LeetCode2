package com.javashitang.tree._101;

/**
 * @author lilimin
 * @since 2021-07-04
 */
class Solution {

    public boolean isSymmetric(TreeNode root) {
        return judge(root.left, root.right);
    }

    public boolean judge(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return judge(left.left, right.right) && judge(left.right, right.left);
    }
}
