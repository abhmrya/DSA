package DSA.Queue;

public class ArrayQueueUsingOnePtr {
    private int[] queue;
    int rear;
    int capacity;

    public ArrayQueueUsingOnePtr(int size){
        this.capacity=size;
        rear=-1;
        this.queue = new int[capacity];
        System.out.println("Queue has been created of size "+size);
    }

    public void enqueue(int x){
        if(isFull()){
            System.out.println("Can not insert because queue is full ");
            return ;
        }
        rear++;
        queue[rear]=x;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Can not delete because queue is empty.");
            return -1;
        }
        int removeElement=queue[0];
        for(int i=1;i<=rear;i++){
            queue[i-1]=queue[i];
        }
        rear--;
        return removeElement;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return rear==queue.length-1;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("can not peek because queue is empty.");
            return -1;
        }
        return queue[0];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Can not display because queue is empty.");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

}
