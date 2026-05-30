package DSA.BinarySearchTree;

import java.util.Stack;

public class ConstructBSTPreOrderM3 {
    Node root;
    

    // recursion Method 
    Node constructBstPre(int[] pre ,int[] i,int upper){
        if(i[0]==pre.length || pre[i[0]]>upper) return null;
        Node root= new Node(pre[i[0]]);
        i[0]++;
        root.left = constructBstPre(pre, i, root.data);
        root.right = constructBstPre(pre, i, upper);
        return root;
    }

    // Iterative Approach 

    Node constructBstPreIterative(int[] preorder){
        Stack<Node> stack = new Stack<>();
        if(preorder.length==0) return null;
        Node root = new Node(preorder[0]);
        stack.push(root);
        Node temp=root;
        for(int i=1;i<preorder.length;i++){
            Node newNode = new Node(preorder[i]);
            if(stack.peek().data>preorder[i]){
                stack.peek().left=newNode;
                temp = newNode;
                stack.push(newNode);
            }else{
                while(!stack.isEmpty() && stack.peek().data<preorder[i]){
                    temp = stack.pop();
                }
                temp.right = newNode;
                temp = newNode;
                stack.push(newNode);
            }
        }
        return root;
    }
}
