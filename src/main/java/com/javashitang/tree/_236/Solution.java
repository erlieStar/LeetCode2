package com.javashitang.tree._236;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-08-01
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> list1 = new ArrayList<>();
        List<TreeNode> list2 = new ArrayList<>();
        inorder(root, p, list1);
        inorder(root, q, list2);
        TreeNode targetNode = null;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                targetNode = list1.get(i);
            }
        }
        return targetNode;
    }

    public void inorder(TreeNode root, TreeNode target, List<TreeNode> list) {
        if (root == null || root == target) {
            return;
        }
        list.add(root);
        inorder(root.left, target, list);
        inorder(root.right, target, list);
    }
}
