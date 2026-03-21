package DSA.CircularLL;

public class CircularLList {
    private Node head;
    private Node tail;
    private int size;

    Node insertbeginning(int data) {
        Node newNode = new Node(data);
        // if (head == null) {
        //     head = newNode;
        //     tail=newNode;
        //     head.next = head;
        //     size++;
        //     return head;
        // }
        if (tail == null) {
            tail=newNode;
            tail.next = tail;
            size++;
            return tail;
        }
        // case 1: we have both head and tail
        /*tail.next=newNode;
        newNode.next = head;
        head=newNode;
        size++;
        return head;*/

        // Case 2 : we have only head
        // Node temp = head;
        // do {
        //     temp=temp.next;
            
        // } while (temp.next!=head);
        // temp.next=newNode;
        // newNode.next=head;
        // size++;
        // return head;

        // Case 3 : only given tail
        head = tail.next;
        newNode.next=head;
        tail.next=newNode;
        head=newNode;
        size++;
        return head;
    }

    Node insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next = head;
            size++;
            return head;
        }
        // case 1: we have both head and tail
        tail.next = newNode;
        newNode.next=head;
        tail = newNode;
        size++;
        return head; 
    }

    void traverseCLL(Node head){
        if(head==null){
            System.out.println("List is empty.");
        }
        Node temp = head;
        do { 
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        } while (temp!=head);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Node head=null;
        CircularLList obj = new CircularLList();
        head=obj.insertbeginning(10);
        head=obj.insertbeginning(20);
        head=obj.insertbeginning(40);
        head=obj.insertbeginning(50);
        head = obj.insertAtEnd(60);
        obj.traverseCLL(head);
    }
}
