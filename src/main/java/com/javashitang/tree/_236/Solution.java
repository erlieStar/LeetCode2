package com.javashitang.tree._236;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-08-01
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        List<TreeNode> resultPath1 = new ArrayList<>();
        List<TreeNode> resultPath2 = new ArrayList<>();
        List<TreeNode> path1 = new ArrayList<>();
        path1.add(root);
        List<TreeNode> path2 = new ArrayList<>();
        path2.add(root);
        backtracking(root, path1, p, resultPath1);
        backtracking(root, path2, q, resultPath2);
        TreeNode targetNode = null;
        for (int i = 0; i < resultPath1.size() && i < resultPath2.size(); i++) {
            if (resultPath1.get(i) == resultPath2.get(i)) {
                targetNode = resultPath1.get(i);
            }
        }
        return targetNode;
    }

    public void backtracking(TreeNode root, List<TreeNode> path, TreeNode target, List<TreeNode> resultPath) {
        if (root.val == target.val) {
            resultPath.addAll(path);
            return;
        }
        if (root.left != null) {
            path.add(root.left);
            backtracking(root.left, path, target, resultPath);
            path.remove(root.left);
        }
        if (root.right != null) {
            path.add(root.right);
            backtracking(root.right, path, target, resultPath);
            path.remove(root.right);
        }
    }
}
