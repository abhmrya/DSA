package DSA.BinarySearchTree;

public class ConstructBSTPreOrderM3 {
    Node root;
    Node constructBstPre(int[] pre ,int[] i,int upper){
        if(i[0]==pre.length || pre[i[0]]>upper) return null;
        Node root= new Node(pre[i[0]]);
        i[0]++;
        root.left = constructBstPre(pre, i, root.data);
        root.right = constructBstPre(pre, i, upper);
        return root;
    }
}
