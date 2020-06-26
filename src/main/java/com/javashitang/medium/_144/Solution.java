package com.javashitang.medium._144;

import java.util.*;

public class Solution {

    //二叉树的先序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        List<Integer> vals = new ArrayList<>();
        if (root != null)
            nodes.push(root);
        while (!nodes.isEmpty()) {
            //获取头部元素，并且移除
            TreeNode treeNode = nodes.pop();
            vals.add(treeNode.val);
            if (treeNode.right != null) {
                nodes.push(treeNode.right);
            }
            if (treeNode.left != null){
                nodes.push(treeNode.left);
            }
        }
        return vals;
    }
}
