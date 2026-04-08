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
        else{
            front=((front-1)+size)%size;
        }
        // else if(front==0){
        //     front=size-1;
        // }
        // else{
        //     front--;
        // }
        deque[front]=x;
    }

    void addRear(int x) throws Exception{
        if(isFull()) throw new Exception("Can add because deque is full.");
        if(front==-1){
            front=0;
            rear=0;
        }else if(rear==size-1){
            rear=0;
        }else{
            rear++;
        }
        deque[rear]=x;
    }

    int deleteFront() throws Exception{
        if(isEmpty()) throw new Exception("Can not dispaly. deque is empty.");
        int removeElement = deque[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else if(front==size-1){
            front=0;
        }else{
            front++;
        }
        return removeElement;
    }

        int deleteRear() throws Exception{
        if(isEmpty()) throw new Exception("Can not dispaly. deque is empty.");
        int removeElement = deque[rear];
        if(front==rear){
            front=-1;
            rear=-1;
        }else if(rear==0){
            rear=size-1;
        }else{
            rear--;
        }
        return removeElement;
    }

    boolean isFull(){
        return (rear+1==front) || (front==0 && rear==size-1);
    }

    boolean isEmpty(){
        return front==-1;
    }

    void display() throws Exception{
        if(isEmpty()) throw new Exception("Can not dispaly. deque is empty.");
        int i=front;
        while(i!=rear){
            System.out.print(deque[i]+" ");
            i=(i+1)%size;
        }
        System.out.println(deque[rear]);

    }

    public static void main(String[] args) throws Exception {
        DequeUsingCircularArray deque = new DequeUsingCircularArray(5);
        deque.addfront(10);
        deque.addfront(20);
        deque.addfront(30);
        deque.addRear(40);
        deque.addRear(50);
        deque.display();
        System.out.println(deque.deleteFront());
        deque.display();
        System.out.println(deque.deleteRear());
        deque.display();
    }   
}