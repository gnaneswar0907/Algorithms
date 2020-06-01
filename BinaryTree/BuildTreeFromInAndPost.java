import java.util.*;

public class BuildTreeFromInAndPost {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] inord;
    int[] postord;
    int m = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inord = inorder;
        this.postord = postorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        m = postorder.length - 1;
        return buildTreeHelper(0, inorder.length - 1);
    }

    public TreeNode buildTreeHelper(int l, int h) {
        TreeNode node = null;
        if (m >= 0 && l <= h) {
            int x = postord[m--];
            node = new TreeNode(x);
            node.right = buildTreeHelper(map.get(x) + 1, h);
            node.left = buildTreeHelper(l, map.get(x) - 1);
        }
        return node;
    }

    public static void main(String[] args) {
        BuildTreeFromInAndPost build = new BuildTreeFromInAndPost();
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] postorder = { 9, 15, 7, 20, 3 };
        TreeNode root = build.buildTree(inorder, postorder);
        BinaryTreeUtils.printTree(root);
    }
}