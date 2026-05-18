package DSA.Binary_Tree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;          

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

    public ArrayList<Integer> inorderTraversal(Node rootNode){
        ArrayList<Integer> list = new ArrayList<>();
        if(rootNode==null) return list;
        list.addAll(inorderTraversal(rootNode.left));
        list.add(rootNode.data);
        list.addAll(inorderTraversal(rootNode.right));
        return list;
    }

    public ArrayList<Integer> inOrderIterative(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            if(root==null){
                root = stack.pop();
                list.add(root.data);
                root = root.right;
            }
        }
        return list;
    }

    public ArrayList<Integer> preOrderTraversal(Node rootNode){
        ArrayList<Integer> list = new ArrayList<>();
        if(rootNode==null) return list;
        list.add(rootNode.data);
        list.addAll(preOrderTraversal(rootNode.left));
        list.addAll(preOrderTraversal(rootNode.right));
        return list;
    }

    public ArrayList<Integer> preOrderIterative(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        // M-1

        // while(root!=null || !stack.isEmpty()){
        //     if(root!=null){
        //         list.add(root.data);
        //         stack.push(root);
        //         root = root.left;
        //     }
        //     else{
        //         root = stack.pop();
        //         root = root.right;
        //     }
        // }

        // M-2

        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                list.add(root.data);
                if(root.right!=null){
                    stack.push(root.right);
                }
                root = root.left;
            }if(!stack.isEmpty()){
                root = stack.pop();
            }
        }
        return list;
    }

    public ArrayList<Integer> postOrderTraversal(Node rootNode){
        ArrayList<Integer> list = new ArrayList<>();
        if(rootNode==null) return list;
        list.addAll(postOrderTraversal(rootNode.left));
        list.addAll(postOrderTraversal(rootNode.right));
        list.add(rootNode.data);
        return list;
    }
}
