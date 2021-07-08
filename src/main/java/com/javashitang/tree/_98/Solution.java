package com.javashitang.tree._98;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-05
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(result, root);
        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i) >= result.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void visit(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        visit(result, root.left);
        result.add(root.val);
        visit(result, root.right);
    }
}