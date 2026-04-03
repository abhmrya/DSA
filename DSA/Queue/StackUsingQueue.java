package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer>  queue1 = new LinkedList<>();
    Queue<Integer>  queue2 = new LinkedList<>();
    
    public void push(int x){
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        queue1.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
    }
    public int pop() throws Exception{
        if(empty()){
            throw new Exception("Can not pop because stack is empty.");
        }
        return queue1.remove();

    }

    int top() throws Exception{
        if(empty()){
            throw new Exception("Can not pop because stack is empty.");
        }
        return queue1.peek();
    }

    boolean empty(){
        return queue1.isEmpty();
    }
    public static void main(String[] args) throws Exception{
        StackUsingQueue stackQueue = new StackUsingQueue();
        stackQueue.push(1);
        stackQueue.push(2);
        stackQueue.push(3);
        stackQueue.push(4);
        System.out.println(stackQueue.top());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.pop());
        System.out.println(stackQueue.top());


    }
}
