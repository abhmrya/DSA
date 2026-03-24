package DSA.Stack;

public class StackUsingArrayMain {
    public static void main(String[] args){
        try {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        System.out.println("peek : "+stack.peek());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
