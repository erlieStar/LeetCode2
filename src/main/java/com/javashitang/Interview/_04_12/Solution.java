package com.javashitang.Interview._04_12;

import com.javashitang.hard._145.TreeNode;

class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return doSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int doSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int temp = 0;
        if (root.val == sum) {
            temp++;
        }
        temp += doSum(root.left, sum - root.val);
        temp += doSum(root.right, sum - root.val);
        return temp;
    }
}
