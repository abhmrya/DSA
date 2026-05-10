package DSA.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraversal {

    public Node createTree(Scanner scanner){
        System.out.println("Enter node value (-1 for null): ");
        int value = scanner.nextInt();
        if(value==-1) return null;
        Node treeNode = new Node(value);
        System.out.println("Do you want left child of " + value + "? (true/false)");
        boolean left  = scanner.nextBoolean();
        if(left){
            treeNode.left = createTree(scanner);
        }
        System.out.println("Do you want right child of " + value + "? (true/false)");
        boolean right  = scanner.nextBoolean();
        if(right){
            treeNode.right = createTree(scanner);
        }
        return treeNode;
    }

    public List<Integer> levelOrderTraversal(Node root){
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        if(root==null) return list;

        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.remove();

            list.add(current.data);
            System.out.println("root data : "+current.data);
            
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }
        return list;
    }
}
;