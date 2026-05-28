package DSA.Binary_Tree;

public class BinaryTreeUsingPostAndIn {
    static int search(int[] inOrder,int val){
        for(int i=0;i<=inOrder.length-1;i++){
            if(val==inOrder[i]) return i;
        }
        return -1;
    }

    static Node constructTree(int[] inOrder,int[] postOrder,int[] postIndex,int inStart,int inEnd){
        if(inStart>inEnd) return null;
        int inIndex = search(inOrder,postOrder[postIndex[0]]);
        Node root = new Node(postOrder[postIndex[0]]);
        postIndex[0]--;
        root.right = constructTree(inOrder, postOrder, postIndex, inIndex+1, inEnd);
        root.left = constructTree(inOrder, postOrder, postIndex, inStart,inIndex-1);
        return root;
    }

    static void displayTree(Node node ,int level){
        if(node==null) return;
        displayTree(node.right, level+1);
        for (int i=0;i<level;i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left, level+1);
    }
    public static void main(String[] args) {
        int[] inOrder = {2,7,4,5,9,12,6};
        int[] postOrder = {2,4,7,9,6,12,5};
        int[] postIndex = {postOrder.length-1};
        Node root = constructTree(inOrder,postOrder,postIndex,0,inOrder.length-1);
        displayTree(root,0);
    }
}
