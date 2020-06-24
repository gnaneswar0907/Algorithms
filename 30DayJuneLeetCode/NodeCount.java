
/**
 * Given a complete binary tree, count the number of nodes.
 * Note:Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes 
 * in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h
 * 
 * Input: 
    1
   / \
  2   3
 / \  /
4  5 6

Output: 6
 */

import BinaryTree.*;

public class NodeCount {
    int l = 0;

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        count(root);
        return l;
    }

    public void count(TreeNode root) {
        if (root.left != null)
            count(root.left);
        l++;
        if (root.right != null)
            count(root.right);
    }
}