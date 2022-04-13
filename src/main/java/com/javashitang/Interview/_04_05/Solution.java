package com.javashitang.Interview._04_05;

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
        if (root.left != null) {
            boolean flag = doValid(root.left, left, root.val);
            if (!flag) {
                return false;
            }
        }
        if (root.right != null) {
            boolean flag = doValid(root.right, root.val, right);
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
