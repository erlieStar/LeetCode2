package com.javashitang.tree._105;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-06-25
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                int[] preOrderLeft = Arrays.copyOfRange(preorder, 1, i + 1);
                int[] preOrderRight = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                int[] inOrderLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inOrderRight = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                treeNode.left = buildTree(preOrderLeft, inOrderLeft);
                treeNode.right = buildTree(preOrderRight, inOrderRight);
            }
        }
        return treeNode;
    }
}
