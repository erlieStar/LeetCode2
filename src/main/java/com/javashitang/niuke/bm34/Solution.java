package com.javashitang.niuke.bm34;

import com.javashitang.hard._145.TreeNode;

public class Solution {

    public boolean isValidBST (TreeNode root) {
        return doValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean doValid(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return doValid(root.left, min, root.val) && doValid(root.right, root.val, max);
    }
}
