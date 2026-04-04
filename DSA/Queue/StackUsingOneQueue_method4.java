package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue_method4 {
    Queue<Integer> queue = new LinkedList<>();

    public void push(int x){
        if(queue.isEmpty()){
            queue.add(x);
        }
        else if(!queue.isEmpty()){
            queue.add(x);
            int size =queue.size();
            for (int i = 0; i < size-1; i++) {
                queue.add(queue.remove());
            }
        }
    }
    public int pop() throws Exception{
        if(empty()){
            throw new Exception("Can not pop because stack is empty.");
        }
        return queue.remove();
    }

    public int top() throws Exception{
        if(empty()){
            throw new Exception("Can not peek because stack is empty.");
        }
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        StackUsingOneQueue_method4 stackQueue = new StackUsingOneQueue_method4();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        stackQueue.push(4);
        System.out.println("peek : "+stackQueue.top());
        System.out.println("pop : "+stackQueue.pop());
        System.out.println("peek : "+stackQueue.top());
        System.out.println("pop : "+stackQueue.pop());
        System.out.println("pop : "+stackQueue.pop());
        // System.out.println("pop : "+stackQueue.pop());
        System.out.println("peek : "+stackQueue.top());
        // System.out.println("pop : "+stackQueue.pop());
    }
}
