package com.javashitang.tree._538;




/**
 * @author lilimin
 * @since 2021-07-30
 */
class Solution {

    private Integer sum;

    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        inorder(root);
        buildTree(root);
        return root;
    }

    private void buildTree(TreeNode root) {
        if (root == null) {
            return;
        }
        buildTree(root.left);
        int temp = root.val;
        root.val = sum;
        sum -= temp;
        buildTree(root.right);
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        sum += root.val;
        inorder(root.right);
    }
}
