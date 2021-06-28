package com.javashitang.tree._337.case3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-06-24
 * [4,1,null,2,null,3]
 * 超时间
 */
class Solution {

    public int rob(TreeNode root) {
        Map<TreeNode, Integer> cache = new HashMap<>();
        return subRob(root, cache);
    }

    public int subRob(TreeNode root, Map<TreeNode, Integer> cache) {
        if (root == null) {
            return 0;
        }
        if (cache.containsKey(root)) {
            return cache.get(root);
        }
        // 偷该节点
        int steal = root.val;
        if (root.left != null) {
            steal += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            steal += rob(root.right.left) + rob(root.right.right);
        }
        // 不偷该节点
        int notSteal = rob(root.left) + rob(root.right);
        int result = Math.max(steal, notSteal);
        cache.put(root, result);
        return result;
    }
}
