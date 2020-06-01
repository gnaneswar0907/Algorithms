import java.util.*;

public class BuildTreeFromInAndPre {
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] inord;
    int[] preord;
    int m = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.inord = inorder;
        this.preord = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        m = 0;
        return buildTreeHelper(0, inorder.length - 1);
    }

    public TreeNode buildTreeHelper(int l, int h) {
        TreeNode node = null;
        if (m < preord.length && l <= h) {
            int x = preord[m++];
            node = new TreeNode(x);
            node.left = buildTreeHelper(l, map.get(x) - 1);
            node.right = buildTreeHelper(map.get(x) + 1, h);
        }
        return node;
    }

    public static void main(String[] args) {
        BuildTreeFromInAndPre build = new BuildTreeFromInAndPre();
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] preorder = { 3, 9, 20, 15, 7 };
        TreeNode root = build.buildTree(preorder, inorder);
        BinaryTreeUtils.printTree(root);
    }
}