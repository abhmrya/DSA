package DSA.BinarySearchTree;

public class CreateBST {
    Node root;
    CreateBST(){
            root=null;
    }
    Node insert(Node node,int value){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value>node.data){
            node.right = insert(node.right, value);
        }
        else{
            node.left = insert(node.left, value);
        }
        return node;
    }
    void displayTree(Node node ,int level){
        if(node==null) return;
        displayTree(node.right, level+1);
        for (int i=0;i<level;i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left, level+1);
    }
    Node inOrder(Node root){
        if(root==null) return null;
        root.left = inOrder(root.left);
        System.out.print(" "+root.data);
        root.right = inOrder(root.right);
        return root;
    }

}
