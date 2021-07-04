package com.javashitang.tree._114;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-02
 */
class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        List<Integer> values = new ArrayList<>();
        build(values, root.left);
        build(values, root.right);
        root.left = null;
        TreeNode temp = root;
        for (Integer value : values) {
            TreeNode treeNode = new TreeNode();
            treeNode.val = value;
            temp.right = treeNode;
            temp = temp.right;
        }
    }

    public void build(List<Integer> values, TreeNode root) {
        if (root == null) {
            return;
        }
        values.add(root.val);
        build(values, root.left);
        build(values, root.right);
    }
}
