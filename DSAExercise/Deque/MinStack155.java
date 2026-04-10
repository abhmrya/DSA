package DSAExercise.Deque;

import java.util.Stack;

public class MinStack155 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> minval = new Stack<>();
    public MinStack155() {

    }
    
    public void push(int val) {
        stack1.push(val);
        if(minval.isEmpty() || val<=minval.peek()){
            minval.push(val);
        }
    }
    
    public void pop() {
        if(stack1.peek().equals(minval.peek())){
            minval.pop();
        }
        stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return minval.peek();
    }

    public static void main(String[] args) {
        MinStack155 obj = new MinStack155();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println("getmin : "+obj.getMin());
        obj.pop();
        obj.top();
        System.out.println("getmin : "+obj.getMin());

    }
}
