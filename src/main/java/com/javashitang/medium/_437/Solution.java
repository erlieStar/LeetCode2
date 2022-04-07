package com.javashitang.medium._437;

class Solution {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int result = rootSum(root, targetSum);
        result += pathSum(root.left, targetSum);
        result += pathSum(root.right, targetSum);
        return result;
    }

    public int rootSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.val == targetSum) {
            sum++;
        }
        sum += rootSum(root.left, targetSum - root.val);
        sum += rootSum(root.right, targetSum - root.val);
        return sum;
    }
}
