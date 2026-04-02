package DSA.Queue;

public class QueueUsingLinkedList {
    Node front,rear;
    int data;

    QueueUsingLinkedList(){
        front=null;
        rear=null;
    }

    public void enQueue(int data){
        Node newNode = new Node(data);
        
        if(front==null){
            front=newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void deQueue(){
        if(front==null){
            System.out.println("Queue is Empty.");
            return;
        }
        front = front.next;
        if(front==null){
            rear=null;
        }
    }
    public void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
