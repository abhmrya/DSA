package DSA.AVL;
public class Node {
    int data;
    Node left;
    Node right;
    int height;

    Node(int val){
        data=val;
        left=null;
        right=null;
        height=1;
    }
}
