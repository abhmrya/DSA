package DSA.Queue;
public class CircularQueueDemoMain {
    public static void main(String[] args) throws Exception{
        CircularQueueDemo cqueue  = new CircularQueueDemo(5);
        cqueue.enqueue(10);
        cqueue.enqueue(20);
        cqueue.enqueue(30);
        cqueue.display();
        System.out.println("Remove element is : " + cqueue.dequeue());
        System.out.println("Remove element is : " + cqueue.dequeue());
        cqueue.enqueue(40);
        cqueue.enqueue(40);
        System.out.println("front : "+cqueue.front());
        cqueue.display();
    }
}
