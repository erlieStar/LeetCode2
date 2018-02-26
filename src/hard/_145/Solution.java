package hard._145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    //二叉树的后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        List<Integer> vals = new ArrayList<>();
        TreeNode lastVistNode = null;
        while (root != null) {
            nodes.push(root);
            root = root.left;
        }
        while (!nodes.isEmpty()) {
            //获取头部元素，并且移除
            TreeNode treeNode = nodes.pop();
            if (treeNode.right != null) {

            } else {

            }
        }
        return vals;
    }
}
