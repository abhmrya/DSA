package DSA.Queue;

public class QueueUsingLinkedList {
    Node front,rear;
    int count;

    public QueueUsingLinkedList(){
        count=0;
        front=null;
        rear=null;
    }

    boolean enQueue(int data){
        Node newNode = new Node(data);
        
        if(front==null){
            front=newNode;
            rear = newNode;
            return true;
        }
        rear.next = newNode;
        rear = newNode;
        return true;
    }

    int deQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not delete because queue is empty.");
        }
        Node temp = front;
        front = front.next;
        if(front==null){
            rear=null;
        }
        return temp.data;
    }

    boolean isEmpty(){
        return front==null;
    }

    int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not delete because queue is empty.");
        }
        return front.data;
    }

    void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not display because queue is empty.");
        }
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // public void deQueue(){
    //     if(front==null){
    //         System.out.println("Queue is Empty.");
    //         return;
    //     }
    //     front = front.next;
    //     if(front==null){
    //         rear=null;
    //     }
    // }
    // public void display(){
    //     Node temp = front;
    //     while(temp!=null){
    //         System.out.print(temp.data+"->");
    //         temp = temp.next;
    //     }
    //     System.out.println("End");
    // }
}
