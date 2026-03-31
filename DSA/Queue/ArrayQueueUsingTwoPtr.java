package DSA.Queue;

public class ArrayQueueUsingTwoPtr {
    private int[] queue;
    private int rear, front;
    private int capacity;

    public ArrayQueueUsingTwoPtr(int size) {
        front = -1;
        rear = -1;
        this.queue = new int[size];
        System.out.println("Queue has been created of size " + size);
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("CAn insert because queue is full ");
            return;
        }
        rear++;
        queue[rear]=x;
        if(front == -1 ){
            front++;
        }
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty so can not delete.");
        }
        if(front==rear){
            int removeElement = queue[front];
            front=-1;
            rear =-1;
            return removeElement;
        }
        int removeElement = queue[front];
        front++;
        return removeElement;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not peek becase queue is empty");
        }
        return queue[front];
    }


    public boolean isEmpty(){
        return rear==-1 || front>rear;
    }

    public boolean isFull(){
        return rear == queue.length -1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return ;
        
        }
        for (int i = front; i <=rear; i++) {
            System.out.println(queue[i]+ " ");
            
        }
    }
}
