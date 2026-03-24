package DSA.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        Stack<Object> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(20.03f);
        stack.push(1);
        stack.push("Abhay");

        System.out.println("size : "+stack.size());

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        // System.out.println("Peeked elelemt is : " +stack.peek());
        // System.out.println("papped elelemt is : "+stack.pop());
        // System.out.println("Peeked elelemt is : " +stack.peek());
        // System.out.println("size : "+stack.size());
    }
}
