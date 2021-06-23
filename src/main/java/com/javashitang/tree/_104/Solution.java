package com.javashitang.tree._104;


/**
 * @author lilimin
 * @since 2021-06-23
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
