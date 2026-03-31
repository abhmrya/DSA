package DSA.Queue;

public class ArrayQueueTwoPtrMain {

    public static void main(String[] args) {
        try {
            ArrayQueueUsingTwoPtr queue = new ArrayQueueUsingTwoPtr(5);
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.display(); 
            System.out.println(queue.front());
            System.out.println("\n Front element is: "+queue.front());          
            System.out.println("remove element is: "+queue.dequeue());
            System.out.println("remove element is: "+queue.dequeue());
            System.out.println("remove element is: "+queue.dequeue());  
            System.out.println("remove element is: "+queue.dequeue());
            System.out.println("remove element is: "+queue.dequeue());  
            System.out.println("\n Front element is: "+queue.front());   
            queue.enqueue(60);
            queue.display();       
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
