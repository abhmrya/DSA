package DSAExercise.Stack;

public class StackUsingArrayMain {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(50);
        
        System.out.println("peek : "+stack.peek());
        // stack.display();
        System.out.println("pop : "+stack.pop());
        System.out.println("peek : "+stack.peek());
        System.out.println("size : "+stack.maxSize);
    }
}
