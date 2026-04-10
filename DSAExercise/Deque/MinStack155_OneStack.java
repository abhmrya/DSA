package DSAExercise.Deque;

import java.util.Stack;

public class MinStack155_OneStack {
    Stack<Integer> mainStack;
    int min;

    MinStack155_OneStack(){
        mainStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    void push(int val){
        if(val<=min){
            mainStack.push(min);
            min = val;
        }
        mainStack.push(val);
    }

    void pop(){
        int x = mainStack.pop();
        if(x==min){
            min=mainStack.pop();
        }
    }
    int top(){
        return mainStack.peek();
    }
    int getMin(){
        return min;
    }

    public static void main(String[] args) {
        MinStack155_OneStack stack = new MinStack155_OneStack();
        stack.push(10);
        stack.push(5);
        System.out.println("Minium element is: "+stack.getMin());
        stack.push(15);
        stack.push(1);
        System.out.println("Minium element is: "+stack.getMin());
        stack.push(25);
        System.out.println("Minium element is: "+stack.getMin());
        stack.pop();
        stack.pop();
        System.out.println("Minium element is: "+stack.getMin());
    }
}
