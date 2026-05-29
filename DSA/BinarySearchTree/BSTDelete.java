package DSA.BinarySearchTree;

public class BSTDelete {
    public Node find(Node root){
        while (root.left!=null) { 
            root = root.left;
        }
        return root;
    }
    Node deleteBst(Node root,int element){

        if(root==null) return null;

        if(root.data<element){
            root.right = deleteBst(root.right, element);
        }
        else if(root.data>element){
            root.left=deleteBst(root.left, element);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                Node presucces = find(root.right);
                root.data = presucces.data;
                root.right = deleteBst(root.right, presucces.data);
            }
        }
        return root;
    } 
}
