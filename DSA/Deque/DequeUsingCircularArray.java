package DSA.Deque;

public class DequeUsingCircularArray {
    int[] deque;
    int front,rear;
    int size;
    public DequeUsingCircularArray(int size){
        this.size = size;
        this.deque = new int[size];
        this.rear =-1;
        this.front=-1;
        System.out.println("Deque has been created of size "+this.size);
    }
    void addfront(int x) throws Exception{
        if(isFull()) throw new Exception("Can add because deque is full.");
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(front==0){
            size=size-1;
        }
        else{
            front--;
        }
        deque[front]=x;
    }

    boolean isFull(){
        return (rear+1==front) || (front==0 && rear==size-1);
    }
    boolean isEmpty(){
        return front==-1;
    }
    void dispaly() throws Exception{
        if(isEmpty()) throw new Exception("Can not dispaly. deque is empty.");
        int i=front;
        while(i!=rear){
            System.out.println(deque[i]+" ");
            i=(i+1)%size;
        }
        System.out.println(deque[rear]);

    }

    public static void main(String[] args) {
        DequeUsingCircularArray deque = new DequeUsingCircularArray(5);
    }
}
