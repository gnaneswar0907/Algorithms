public class BinaryTreeUtils {
    static final int COUNT = 10;

    public static void printTreeUtil(TreeNode root, int space) {
        if (root == null)
            return;
        space += COUNT;
        printTreeUtil(root.right, space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");
        printTreeUtil(root.left, space);
    }

    // Wrapper over printTreeUtil()
    public static void printTree(TreeNode root) {
        printTreeUtil(root, 0);
    }
}