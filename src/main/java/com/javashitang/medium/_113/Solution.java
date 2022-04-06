package com.javashitang.medium._113;

import com.javashitang.hard._145.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<Integer> temp = new ArrayList<>();
        dfs(root, 0, targetSum, temp, result);
        return result;
    }

    public void dfs(TreeNode root, int index, int targetSum, List<Integer> temp, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                temp.add(index, root.val);
                result.add(new ArrayList<>(temp));
                temp.remove(index);
            }
        } else {
            temp.add(index, root.val);
            dfs(root.left, index + 1, targetSum - root.val, temp, result);
            dfs(root.right, index + 1, targetSum - root.val, temp, result);
            temp.remove(index);
        }
    }
}
