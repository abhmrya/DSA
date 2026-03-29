package DSA.Queue;

public class ArrayQueueUsingOnePtrMain{
    public static void main(String[] args) {
        ArrayQueueUsingOnePtr queue = new  ArrayQueueUsingOnePtr(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("Front element is : "+queue.front());
        System.out.println("Remove element is: "+queue.dequeue());
        System.out.println("Front element is : "+queue.front());
        queue.display();
    }
}