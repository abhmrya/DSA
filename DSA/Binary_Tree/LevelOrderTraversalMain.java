package DSA.Binary_Tree;

import java.util.Scanner;

public class LevelOrderTraversalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LevelOrderTraversal leveltree = new LevelOrderTraversal();
        Node treeroot = leveltree.createTree(scanner);
        System.out.println("Level traverse : "+leveltree.levelOrderTraversal(treeroot));
    }
}
