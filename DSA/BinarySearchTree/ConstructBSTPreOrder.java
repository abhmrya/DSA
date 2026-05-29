package DSA.BinarySearchTree;

// call by main BST

public class ConstructBSTPreOrder {
    Node root;
    ConstructBSTPreOrder(){
        root = null;
    }

    Node constructBstPre(int[] arr,int start,int end){
        if(start>end) return null;
        Node root = new Node(arr[start]);
        int i;
        for(i=start+1;i<=end;i++){
            if(arr[i]>arr[start]) break;
        }
        root.left = constructBstPre(arr,start+1,i-1);
        root.right = constructBstPre(arr,i,end);
        return root;
    }
    
}
