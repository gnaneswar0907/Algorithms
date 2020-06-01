import java.util.*;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();

        // Restrictive Solution
        // if (root != null){
        // l.add(root.val);
        // l.addAll(preorderTraversal(root.left));
        // l.addAll(preorderTraversal(root.right));
        // }
        // return result;

        // Iterative Solution
        Stack<TreeNode> stck = new Stack<>();
        if (root == null)
            return l;
        stck.push(root);
        while (!stck.isEmpty()) {
            TreeNode temp = stck.pop();
            l.add(temp.val);
            if (temp.right != null)
                stck.push(temp.right);
            if (temp.left != null)
                stck.push(temp.left);
        }
        return l;
    }
}