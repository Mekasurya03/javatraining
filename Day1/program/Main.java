import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter root value: ");
        int rootValue = sc.nextInt();

        System.out.print("Enter left child value: ");
        int leftValue = sc.nextInt();

        System.out.print("Enter right child value: ");
        int rightValue = sc.nextInt();

        TreeNode root = new TreeNode(rootValue);
        root.left = new TreeNode(leftValue);
        root.right = new TreeNode(rightValue);

        System.out.println(checkTree(root));

        sc.close();
    }
}
