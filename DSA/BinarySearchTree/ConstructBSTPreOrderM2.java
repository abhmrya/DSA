package DSA.BinarySearchTree;

// call by main BST
// M-2
// this is *** Method 2 *** 
// Methos 1 is already see by CreateBST 

public class ConstructBSTPreOrderM2 {
    Node root;
    ConstructBSTPreOrderM2(){
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
