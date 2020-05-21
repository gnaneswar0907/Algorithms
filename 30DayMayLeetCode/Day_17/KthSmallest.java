public class KthSmallest {

    int res = 0, c = 0;

    public int kthSmallest(TreeNode root, int k) {
        c = k;
        populate(root);
        return res;
    }

    public void populate(TreeNode root) {
        if (root != null) {
            populate(root.left);
            c--;
            if (c == 0) {
                res = root.val;
                return;
            }
            populate(root.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}