import java.util.*;
import BinaryTree.*;

public class BSTFromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root;
        if (preorder.length == 0)
            return new TreeNode();
        if (preorder.length == 1)
            return new TreeNode(preorder[0]);
        root = new TreeNode(preorder[0]);
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        int i = 1;
        while (i < preorder.length) {
            TreeNode temp = s.peek();
            TreeNode temp2 = new TreeNode(preorder[i]);
            while (!s.isEmpty() && s.peek().val < temp2.val) {
                temp = s.pop();
            }
            if (temp.val < temp2.val)
                temp.right = temp2;
            else
                temp.left = temp2;
            s.push(temp2);
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        BSTFromPreOrder bst = new BSTFromPreOrder();
        int[] preorder = { 8, 5, 1, 7, 10, 12 };
        bst.bstFromPreorder(preorder);
    }
}