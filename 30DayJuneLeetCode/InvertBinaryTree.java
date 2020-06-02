import BinaryTree.TreeNode;

/**
 * Question -
 * 
 * Invert a binary tree.
 * 
 * Input - [4, 2, 7, 1, 3, 6, 9]
 * 
 * Output - [4, 7, 2, 9, 6, 3, 1]
 */

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        if (root.left == null && root.right == null)
            return root;
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}