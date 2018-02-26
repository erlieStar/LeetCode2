package medium._144;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    List<Integer> vals = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root != null) {
            vals.add(root.val);
            if (root.left != null) {
                this.preorderTraversal(root.left);
            }
            if (root.right != null) {
                this.preorderTraversal(root.right);
            }
        }
        return vals;
    }

}
