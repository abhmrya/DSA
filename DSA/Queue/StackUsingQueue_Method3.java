package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue_Method3 {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2= new LinkedList<>();

    public void push(int x){
        queue1.add(x);
    }

    public int pop() throws Exception{
        if(empty()){
            throw new Exception("Can not pop because stack is empty.");
        }
        int size =queue1.size();
        for(int i=0;i<size-1;i++){
            queue2.add(queue1.remove());
        }
        int removedElement = queue1.remove();
        Queue<Integer> temp =queue1;
        queue1=queue2;
        queue2=temp;
        return removedElement;
    }

    int top() throws Exception{
        if(empty()){
            throw new Exception("Can not pop because stack is empty.");
        }
        for(int i=0;i<queue1.size()-1;i++){
            queue2.add(queue1.remove());
        }
        int peekElement = queue1.peek();
        queue2.add(queue1.remove());
        Queue<Integer> temp =queue1;
        queue1=queue2;
        queue2=temp;
        return peekElement;
    }

    boolean empty(){
        return queue1.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        StackUsingQueue_Method3 stackQueue = new StackUsingQueue_Method3();
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