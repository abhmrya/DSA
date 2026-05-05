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
}
