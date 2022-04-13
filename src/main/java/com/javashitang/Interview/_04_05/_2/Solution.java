package com.javashitang.Interview._04_05._2;

import com.javashitang.hard._145.TreeNode;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return doValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean doValid(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }
        if (root.val <= left || root.val >= right) {
            return false;
        }
        return doValid(root.left, left, root.val) && doValid(root.right, root.val, right);
    }
}
