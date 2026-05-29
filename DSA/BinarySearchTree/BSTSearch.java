package DSA.BinarySearchTree;

//  using Main class to call

public class BSTSearch {
    // boolean  searchBst(Node root,int element){
    //     if(root==null) return false;
    //     if(root.data==element) return true;
    //     if(root.data<element){
    //         return searchBst(root.right, element);
    //     }else{
    //         return searchBst(root.left, element);
    //     }
    // }

    boolean  searchBst(Node root,int element){
        if(root==null) return false;
        while(root!=null){
            if(root.data ==element) return true;
            if(root.data<element){
                root = root.right;
            }else{
                root = root.left;
            }
        }
        return false;
    }
}
