package DSA.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueueSwapMethos2 {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2= new LinkedList<>();

    public void push(int x){
        
        queue2.add(x);
        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
        Queue<Integer> temp =queue1;
        queue1=queue2;
        queue2=temp;

    }
    public static void main(String[] args) {
        
    }
}