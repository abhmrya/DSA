package DSA.Queue;

public class QueueUsingLinkedListMain {
    public static void main(String[] args) throws Exception{
        QueueUsingLinkedList queueLL = new QueueUsingLinkedList();
        queueLL.enQueue(5);
        queueLL.enQueue(15);
        queueLL.enQueue(25);
        queueLL.enQueue(35);
        queueLL.display();
        queueLL.deQueue();
        System.out.println(queueLL.peek());
        queueLL.display();
    }
}
