package DSA.Queue;
import java.util.LinkedList;
import  java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue is : "+queue);
        System.out.println("remove : "+queue.remove());
         System.out.println("Queue is : "+queue);
          System.out.println("Queue is peek: "+queue.peek());
          System.out.println("element : "+queue.element());
          System.out.println("remove : "+queue.remove());
          System.out.println("remove : "+queue.remove());
        //   System.out.println("remove : "+queue.remove());
          System.out.println("poll : "+queue.poll());
          System.out.println("poll : "+queue.poll());

    }
}
