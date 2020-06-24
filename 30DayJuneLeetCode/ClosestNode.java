
/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 * 
 * Input: root = [4,2,5,1,3], target = 3.714286

    4
   / \
  2   5
 / \
1   3

Output: 4
 */

import BinaryTree.*;

public class ClosestNode {
    double diff = Double.MAX_VALUE;
    int res = 0;

    public int closestValue(TreeNode root, double target) {
        calcDiff(root, target);
        return res;
    }

    public void calcDiff(TreeNode root, double target) {
        if (root.val == target) {
            diff = Math.abs(target - root.val);
            res = root.val;
        } else {
            if (diff >= (Math.abs(root.val - target))) {
                res = root.val;
                diff = Math.abs(root.val - target);
            }
            if (root.val < target) {
                if (root.right != null)
                    calcDiff(root.right, target);
            } else {
                if (root.left != null)
                    calcDiff(root.left, target);
            }
        }
    }
}