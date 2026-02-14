package DSA.LinkedList;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;

        if(tail==null){
        tail=newNode;
        }
        size++;
    }

    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            insertAtBeginning(data);
            return ;
        }
        // tail.next=newNode;
        // tail=newNode;
        // size++;
        Node temp;
        temp=head;
        while (temp.next!=null) { 
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }

    void insertAtPosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos<= 0 || pos>size+1){
            System.out.println("Position is not valid");
            return ;
        }
        if(head == null){
            if(pos==1){
                insertAtBeginning(data);
                return;
            }
        }
        if(pos==1){
            newNode.next=head;
            head=newNode;
            size++;
            return;
        }
        int currPosition=1;
        Node temp;
        temp =head;
        while(currPosition<pos-1){
            temp=temp.next;
            currPosition++;
        }
        newNode.next = temp.next;
        temp.next=newNode;
        size++;
    }

    void insertAfterValue(int data ,int value){
        Node newNode = new Node(data);
        Node temp;
        temp=head;
        while (temp!=null && temp.data != value) {
            temp = temp.next;
        }
        if(temp!=null){
            newNode.next = temp.next;
            temp.next=newNode;
            size++;
        }else{
            System.out.println("No such value exist in the list so can not insert the data.");
        }
    }

    void traverseLinkedList(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node temp;
        temp=head;
        while (temp!=null) { 
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("\nSize is : "+size);
        System.out.println("END");

    }


    public static void main(String[] args) {
        SinglyLL obj = new SinglyLL();
        obj.insertAtBeginning(10);
        // obj.insertAtBeginning(20);
        // obj.insertAtBeginning(30);
        // obj.insertAtBeginning(1);
        obj.insertAtEnd(100);
        obj.insertAtEnd(101);
        obj.insertAtPosition(25,2);
        obj.insertAfterValue(189,10);
        obj.traverseLinkedList();
    
    // LinkedList<Integer> list = new LinkedList<>();
    // list.add(10);
    }
}
