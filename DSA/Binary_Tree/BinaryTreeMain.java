package DSA.Binary_Tree;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        Node root;
        root = tree.createTree(scanner);
        System.out.println(root.data);
        tree.displayTree(root, 5);
        System.out.println("inorder : "+tree.inorderTraversal(root));

        System.out.println("preOrder : "+tree.preOrderTraversal(root));

        System.out.println("postOrder : "+tree.postOrderTraversal(root));
        scanner.close();

    }
}
