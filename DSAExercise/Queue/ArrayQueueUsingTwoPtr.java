package DSAExercise.Queue;

public class ArrayQueueUsingTwoPtr {
    int[] queue;
    int capacity;
    int front,rear;

    public ArrayQueueUsingTwoPtr(int x){
        this.queue = new int[x];
        this.capacity=x;
        front=-1;
        rear=-1;
    }

    public void enqueue(int x) throws Exception{
        if(isFull()) throw new Exception("Queue is full not insert the  element.");
        rear++;
        queue[rear]=x;
        if(front==-1){
            front++;
        }
    }

    public int dequeue() throws Exception{
        if(isEmpty()) throw new Exception ("queue is empty not delete any element.");
        if(front==rear){
            int removeElement = queue[front];
            front=-1;
            rear =-1;
            return removeElement;
        }
        int deleteElement = queue[front];
        front++;
        return deleteElement;
    }

    public boolean isFull(){
        return (front>capacity);
    }

    public boolean isEmpty(){
        return (front==-1);
    }

    public void display() throws Exception{
        if(isEmpty()) throw new Exception ("queue is empty.");
        int i=front;
        while(i<=rear){
            System.out.print(queue[i]);
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        ArrayQueueUsingTwoPtr queue = new ArrayQueueUsingTwoPtr(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("capacity : "+queue.capacity);
        System.out.println("rear  :"+ queue.rear);
        System.out.println("front  :"+ queue.front);
        queue.display();
    }
}
