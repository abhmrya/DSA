package DSA.Queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void  push(int data){
         // Move all elements to stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
         // Push new element into stack1
        stack1.push(data);
        // Move everything back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); 
        }
    }

    public int pop(){
        if(stack1.isEmpty()){
            System.out.println("queue is empty.");
            return -1;
        }
        return stack1.pop();
        
    }

    // Check if empty
    public boolean empty(){
        return stack1.isEmpty();
    }

    public int peek(){
        if(stack1.isEmpty()){
            System.out.println("queue is empty.");
            return -1;
        }else{
            return stack1.peek();
        }
    }
    public static void main(String[] args) {
        QueueUsingStack stackQueue = new QueueUsingStack();
        System.out.println(stackQueue.peek());
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        stackQueue.push(4);
        System.out.println("peek : "+stackQueue.peek());
        System.out.println("pop : "+stackQueue.pop());
        System.out.println("peek : "+stackQueue.peek());
    }
}
