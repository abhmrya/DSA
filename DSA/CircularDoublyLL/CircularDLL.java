package DSA.CircularDoublyLL;
public class CircularDLL {
    private Node head,tail;
    int size;

    Node insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev=head;
            size++;
            return head;
        }
        newNode.next =head;
        newNode.prev = tail;
        head.prev=newNode;
        tail.next = newNode;
        head=newNode;
        size++;
        return head;
    }

    Node inserAtEnd(int data){
        Node newNode  = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
            newNode.prev=head;
            size++;
            return head;
        }
        newNode.next=head;
        newNode.prev=tail;
        tail.next=newNode;
        head.prev=newNode;
        tail=newNode;
        size++;
        return head;
    }

    Node insertAtPosition(int data,int pos){
        Node newNode = new Node(data);
        if(head==null){
            System.out.println("List is empty.");
            return head;
        }
        if(pos==1){
            return insertAtBeginning(data);
        }
        int currentpos=1;
        Node temp = head;
        Node prevNode=null;
        do { 
            if(currentpos==pos){
                break;
            }
            currentpos++;
            prevNode=temp;
            temp=temp.next;
        } while (temp!=head);
        if(temp==head && currentpos!=pos){
            if(currentpos+1==pos){
                return inserAtEnd(data);
            }
            System.out.println("Position is not valid so can not insert.");
            return head;
        }
        System.out.println("currpos"+currentpos);
        newNode.next=temp;
        newNode.prev=prevNode;
        temp.prev=newNode;
        prevNode.next=newNode;
        return head;
    }

    Node insertAfterValue(int data,int value){
        Node newNode = new Node(data);

        if(head==null){
            System.out.println("List is empty.");
            return head;
        }
        Node temp =head;
        do { 
            if(value==temp.data){
                break;
            }
            temp = temp.next;
        } while (temp!=head);

        if(temp == head && temp.data != value){
            System.out.println("Value not found.");
            return head;
        }

        Node nextNode = temp.next;
        newNode.next=nextNode;
        newNode.prev=temp;
        temp.next=newNode;
        nextNode.prev=newNode;

        if(temp == tail){
            tail = newNode;
        }
        size++;
        return head;
    }


    void traverseCSLL(Node head){
        if(head==null){
            System.out.println("Empty list.");
            return;
        }
        Node temp = head;
        do { 
            System.out.print(temp.data+" ");
            temp=temp.next;
        } while (temp!=head);
        System.out.println();

    }

    void reversetraverseCSLL(Node head){
        if(head==null){
            System.out.println("Empty list.");
            return;
        }
        Node temp = head.prev;
        do { 
            System.out.print(temp.data+" ");
            temp=temp.prev;
        } while (temp!=head.prev);
        System.out.println();

    }
    public static void main(String[] args) {
        Node head;
        CircularDLL cdll = new CircularDLL();
        head = cdll.insertAtBeginning(10);
        head = cdll.insertAtBeginning(20);
        head = cdll.insertAtBeginning(30);
        head = cdll.insertAtBeginning(50);
        head = cdll.insertAtBeginning(70);
        cdll.traverseCSLL(head);
        cdll.reversetraverseCSLL(head);
        head = cdll.inserAtEnd(80);
        cdll.traverseCSLL(head);
        head = cdll.insertAtPosition(100,6);
        cdll.traverseCSLL(head);
        head = cdll.insertAfterValue(200,80);
        cdll.traverseCSLL(head);
    }
}
