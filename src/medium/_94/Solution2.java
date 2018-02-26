package medium._94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {

    List<Integer> vals = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                this.inorderTraversal(root.left);
            }
            vals.add(root.val);
            if (root.right != null) {
                this.inorderTraversal(root.right);
            }
        }
        return vals;
    }
}