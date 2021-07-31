package com.javashitang.tree._617;

/**
 * @author lilimin
 * @since 2021-07-31
 */
class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode rootNode = new TreeNode();
        buildTree(rootNode, root1, root2);
        return rootNode;
    }

    public void buildTree(TreeNode rootNode, TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return;
        }
        int root1Value = root1 == null ? 0 : root1.val;
        int root2Value = root2 == null ? 0 : root2.val;
        rootNode.val = root1Value + root2Value;
        if ((root1 != null && root1.left != null) || (root2 != null && root2.left != null)) {
            TreeNode leftNode = new TreeNode();
            rootNode.left = leftNode;
            buildTree(leftNode, root1 == null ? null : root1.left, root2 == null ? null : root2.left);
        }
        if ((root1 != null && root1.right != null) || (root2 != null && root2.right != null)) {
            TreeNode rightNode = new TreeNode();
            rootNode.right = rightNode;
            buildTree(rightNode, root1 == null ? null : root1.right, root2 == null ? null : root2.right);
        }
    }

}
