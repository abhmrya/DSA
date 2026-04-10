package DSAExercise.Deque;

import java.util.Stack;

public class MinStack155_UsingOneStack_M2 {
     Stack<Long> mainStack;
    long min;

    MinStack155_UsingOneStack_M2(){
        mainStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    void push(int val){
        if(mainStack.isEmpty()){
            mainStack.push(val);
            min=val;
        }else if(val<min){
            long newVal = 2*val -min;
            mainStack.push(newVal);
            min=val;
        }
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
        MinStack155_UsingOneStack_M2 stack = new MinStack155_UsingOneStack_M2();
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
