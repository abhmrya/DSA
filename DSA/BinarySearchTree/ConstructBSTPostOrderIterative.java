package DSA.BinarySearchTree;

import  java.util.Stack;
public class ConstructBSTPostOrderIterative {
    Node root;
    Node temp =null;
    Node constructBSTPostIterative(int[] post){
        int index = post.length-1;
        Stack<Node> stack = new Stack<>();
        if(post.length==0) return null;
        if(temp==null){
            temp = new Node(post[index]);
            stack.push(temp);
        }
        root=temp;
        for(int i=index-1;i>=0;i--){
            Node newNode = new Node(post[i]);
            if(post[i]>stack.peek().data){
                stack.peek().right = newNode;
                temp = newNode;
            }else{
                while(!stack.isEmpty() && stack.peek().data>post[i]){
                    temp = stack.pop();
                }
                temp.left = newNode;
                temp = newNode;
            }
            stack.push(newNode);
        }
        return root;
    }
    
}
