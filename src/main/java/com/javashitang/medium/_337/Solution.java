package com.javashitang.medium._337;

import com.javashitang.hard._145.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<TreeNode, Integer> takeMap = new HashMap<>();
    Map<TreeNode, Integer> notTakeMap = new HashMap<>();

    public int rob(TreeNode root) {
        return Math.max(dfs(root, true), dfs(root, false));
    }

    public int dfs(TreeNode root, boolean take) {
        if (root == null) {
            return 0;
        }
        if (take && takeMap.get(root) != null) {
            return takeMap.get(root);
        }
        if (!take && notTakeMap.get(root) != null) {
            return notTakeMap.get(root);
        }
        int case1 = 0;
        int case2 = 0;
        if (take) {
            int sum1 = root.val + dfs(root.left, false) + dfs(root.right, false);
            int sum2 = dfs(root.left, true) + dfs(root.right, true);
            case1 = Math.max(sum1, sum2);
        } else {
            case2 = dfs(root.left, true) + dfs(root.right, true);
        }
        int sum = Math.max(case1, case2);
        if (take) {
            takeMap.put(root, sum);
        } else {
            notTakeMap.put(root, sum);
        }
        return sum;
    }
}
