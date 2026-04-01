package DSA.Queue;

public class CircularQueueDemo {
    private int[] queue;
    private int rear,front;
    private int n;

    public CircularQueueDemo(int size){
        this.n = size;
        front =-1;
        rear = -1;
        this.queue = new int[n];
        System.out.println("Queue has been operated of size "+size);   
    }

    public boolean  enqueue(int x){
        if(isFull()){
            System.out.println("Can not insert because queue is full ");
            return false;
        }
        if(front==-1 && rear==-1){
            front++;
            rear++;
            queue[rear] =x;
            return true;
        }
        rear = (rear+1)%n;
        queue[rear]=x;
        return true;
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty so can not delete.");
        }
        if(front==rear){
            int removedElement=queue[front];
            front=-1;
            rear =-1;
            return removedElement;
        }
        int removedElement = queue[front];
        front = (front+1)%n;
        return removedElement;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not peek because queue is empty.");
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return (((rear+1)%n)==front);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return;
        }
        int i=front;
        while (i!=rear) {
            System.out.println(queue[i]+" ");
            i = (i+1)%n;
        }
        System.out.println(queue[rear]);
    }
}
