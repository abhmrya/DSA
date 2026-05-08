package DSA.Binary_Tree;

import java.util.Scanner;

public class BinaryTree {
    Node createTree(Scanner scanner){
        System.out.println("Enter node data (-1 for null) : ");
        int value = scanner.nextInt();
        if(value==-1) return null;
        Node newNode = new Node(value);
        System.out.println("Do you want left child of "+value);
        boolean left = scanner.nextBoolean();
        if(left){
            newNode.left = createTree(scanner);
        }

        System.out.println("Do you want right child of "+value);
        boolean right = scanner.nextBoolean();
        if(right){
            newNode.right = createTree(scanner);
        }
        return newNode;
    }

    void displayTree(Node node ,int level){
        if(node==null) return;
        displayTree(node.right, level+1);
        for (int i=0;i<level;i++) {
            System.out.print("  ");
        }
        System.out.println(node.data);
        displayTree(node.left, level+1);
    }

    void inorderTraversal(Node rootNode){
        if(rootNode==null) return;
        inorderTraversal(rootNode.left);
        System.out.println("rootNode value : "+rootNode.data);
        inorderTraversal(rootNode.right);
    }

    void preOrderTraversal(Node rooNode){
        if(rooNode==null) return;
        System.out.println("rootNode value : "+rooNode.data);
        preOrderTraversal(rooNode.left);
        preOrderTraversal(rooNode.right);
        
    }
}
