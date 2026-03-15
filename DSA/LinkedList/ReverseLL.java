package DSA.LinkedList;

public class ReverseLL {
    private Node head;
    private int size;

    // Insert at Beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Revese Node
    void ReverseLL(){
        Node nextTempNode;
        Node prevNode=null;
        Node temp=head;

        if(temp==null){
            System.out.println("List is empty.");
            return;
        }

        while(temp!=null){
            nextTempNode=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=nextTempNode;
        }
        head=prevNode;
    }

    // Traverse Linked List
    void traverse() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
        System.out.println("Size: " + size);
    }

    public static void main(String[] args) {

        ReverseLL obj = new ReverseLL();
        
        obj.insertAtBeginning(10);
        obj.insertAtBeginning(20);
        obj.insertAtBeginning(30);
        obj.insertAtBeginning(40);
        obj.insertAtBeginning(50);

        obj.traverse();

        obj.ReverseLL();

        obj.traverse();
    }
}
