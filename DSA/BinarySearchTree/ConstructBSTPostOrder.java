package DSA.BinarySearchTree;

public class ConstructBSTPostOrder {
    Node root;

    int find(int[] post,int start,int end){
        int i;
        for(i=end-1;i>=start;i--){
            if(post[i]<post[end]){
                break;
            }
        }
        return i;   
        
    }

    Node constructBSTPost(int[] post,int start,int end){
        if(start>end) return null;
        Node root = new Node(post[end]);
        int i = find(post,start,end);
        // int i=0;
        // for(i=end-1;i>=0;i--){
        //     if(post[i]<post[end]){
        //         break;
        //     }
        // }
        root.left = constructBSTPost(post, start, i);
        root.right = constructBSTPost(post, i+1, end-1);
        return root;
    }
}
