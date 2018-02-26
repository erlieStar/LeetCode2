package hard._145;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {

    List<Integer> vals = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
                if (root.left != null) {
                this.postorderTraversal(root.left);
            }
            if (root.right != null) {
                this.postorderTraversal(root.right);
            }
            vals.add(root.val);
        }
        return vals;
    }
}
