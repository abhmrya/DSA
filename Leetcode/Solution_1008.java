package Leetcode;

//  this is my solution but incorrect 
// After same day again try again 
import java.util.Stack;

public class Solution_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = new TreeNode(preorder[0]);
        TreeNode root = node;
        System.out.println("node :"+node.val);
        System.out.println("root :"+root.val);
        stack.push(root);
        for(int i=1;i<preorder.length;i++){
            System.out.println("Enter the loop : " + preorder[i]);
                if(stack.peek().val>preorder[i]){
                    TreeNode newNode = new TreeNode(preorder[i]);
                    stack.push(newNode);
                    root.left=newNode;
                    System.out.println("left root :"+root.left.val);
                    root = root.left;
                    System.out.println("stack peek "+stack.peek().val);
                    System.out.println("root :"+root.val);
                    
                }
                else{
                    
                    while(!stack.isEmpty() && stack.peek().val<preorder[i]){
                        System.out.println("while condition true root.val<preorder[i] : "+root.val+"<" +preorder[i]);
                        if(stack.peek().val>preorder[i]){
                            break;
                        }
                        else{root = stack.pop();
                        System.out.println("pop root :"+root.val);
                        }
                    }
                    stack.push(root);
                    System.out.println("out of while root :"+root.val);
                    TreeNode newNode = new TreeNode(preorder[i]);
                    root.right = newNode;
                    root = root.right;
                    stack.push(root);
                    System.out.println("right root :"+root.val);
                    System.out.println("stack peek root :"+stack.peek().val);
                }
            }
            System.out.println("return : "+node.val);
            return node;
    }
    public static void main(String[] args) {
        int[] arr = {8,5,1,7,10,12};
        Solution_1008 treeroot = new Solution_1008();
        treeroot.bstFromPreorder(arr);
    }
}
