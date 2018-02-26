package medium._94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    //二叉树的先序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        List<Integer> vals = new ArrayList<>();
        while (root != null || !nodes.isEmpty()) {
            while (root != null) {
                nodes.push(root);
                root = root.left;
            }
            // 返回值同时删除
            root = nodes.pop();
            vals.add(root.val);
            root = root.right;
        }
        return vals;
    }
}
