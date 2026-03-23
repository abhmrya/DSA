package DSA.CircularDoublyLL;
public class Node {
    Node next;
    Node prev;
    int data;

    public Node(int data){
        this.data = data;
        this.next=null;
        this.prev=null;
    }

    public Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev = prev;
    }
}
