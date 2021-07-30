package com.javashitang.tree._538.case2;


/**
 * @author lilimin
 * @since 2021-07-30
 */
class Solution {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
