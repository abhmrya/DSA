package DSA.Deque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeueDemo {
    public static void main(String[] args) {
        // Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        deque.add(10);
        deque.addFirst(20);
        deque.addFirst(30);
        System.out.println(deque);
        deque.addLast(40);
        System.out.println(deque);
        deque.addAll(list);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.removeAll(list);
        System.out.println(deque);
        System.out.println("empty : "+deque.isEmpty());
        deque.remove();
        deque.remove();
        System.out.println("empty : "+deque.isEmpty());


    }
}
