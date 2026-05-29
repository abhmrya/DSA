package DSA.BinarySearchTree;

public class BSTInsert {

    // iterative approach

    // Node insertBST(Node root ,int element) throws Exception{
    //     Node newNode = new Node(element);
    //     Node prevNode =null;
    //     if(root==null) return newNode;
    //     while(root!=null){
    //         prevNode=root;
    //         if(root.data==element) throw new Exception("Duplicate not allow.");
    //         if(root.data<element){
    //             root = root.right;
    //         }else{
    //             root = root.left;
    //         }
    //     }
    //     if(element>prevNode.data){
    //         prevNode.right=newNode;
    //     }else{
    //         prevNode.left=newNode;
    //     }
    //     return root;
    // }

    // recursion approach
    Node insertBST(Node root ,int element){
        Node newNode = new Node(element);
        if(root==null) return newNode;
        if(root.data<element){
            root.right = insertBST(root.right,element);
        }else{
            root.left = insertBST(root.left, element);
        }
        return root;
    }
}