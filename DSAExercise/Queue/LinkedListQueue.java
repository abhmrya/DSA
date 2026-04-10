package DSAExercise.Queue;

public class LinkedListQueue {
    Node front,rear;
    int count;

    public LinkedListQueue(int size){
        front=null;
        rear=null;
        count=0;
    }

    boolean enqueue(int x){
        Node newNode = new Node(x);
        if(front==null){
            front = newNode;
            rear=newNode;
            return true;
        }
        



        return true;
    }
}
