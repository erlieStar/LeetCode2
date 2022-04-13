package com.javashitang.Interview._04_08;

import com.javashitang.hard._145.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> left = new ArrayList<>();
        List<TreeNode> right = new ArrayList<>();
        trace(root, p, left);
        trace(root, q, right);
        TreeNode result = null;
        for (int i = 0; i < left.size() && i < right.size(); i++) {
            if (left.get(i) == right.get(i)) {
                result = left.get(i);
                break;
            }
        }
        return result;
    }

    public void trace(TreeNode root, TreeNode target, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        if (root == target) {
            return;
        }
        trace(root.left, target, list);
        trace(root.right, target, list);
        list.add(root);
    }

}
