package DSAExercise.CircularLinkList;

public class CircularLL {
    Node head;
    Node tail;
    int size;
    Node insertbeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=head;
            size++;
            return head;
        }

        // Case 1 : Only give head
        Node temp=head;
        do { 
            temp=temp.next;
            
        } while (temp.next!=head);
        newNode.next=head;
        temp.next=newNode;
        head=newNode;
        size++;
        return head;
    }

    Node reverseCLL(Node head){
        if(head==null){
            System.out.println("List is empty.");
            return head;
        }
        Node nextTemp=null;
        Node temp=head;
        Node prevNode=null;
        do { 
            nextTemp=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=nextTemp;
        } while (temp!=head);
        head.next=prevNode;
        head = prevNode;
        return head;
    }


    void traverseCLL(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;

        } while (temp != head);
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Node head=null;
        CircularLL CLL = new CircularLL();
        head=CLL.insertbeginning(12);
        head=CLL.insertbeginning(22);
        head=CLL.insertbeginning(32);
        head=CLL.insertbeginning(42);
        head=CLL.insertbeginning(52);
        CLL.traverseCLL(head);
        head=CLL.reverseCLL(head);
        CLL.traverseCLL(head);
    }
}