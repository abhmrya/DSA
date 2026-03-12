package DSA.LinkedList;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            insertAtBeginning(data);
            return;
        }
        // tail.next=newNode;
        // tail=newNode;
        // size++;
        Node temp;
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos <= 0 || pos > size + 1) {
            System.out.println("Position is not valid");
            return;
        }
        if (head == null) {
            if (pos == 1) {
                insertAtBeginning(data);
                return;
            }
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        int currPosition = 1;
        Node temp;
        temp = head;
        while (currPosition < pos - 1) {
            temp = temp.next;
            currPosition++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    void insertAfterValue(int data, int value) {
        Node newNode = new Node(data);
        Node temp;
        temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        } else {
            System.out.println("No such value exist in the list so can not insert the data.");
        }
    }

    void deleteforbeginning() {
        if (head == null) {
            System.out.println("can not delete because list is empty");
            return;
        }
        head = head.next;
        size--;
        if(head==null){
            tail=null;
        }
    }

    void deleteFormEnd(){
        if (head == null) {
            System.out.println("can not delete because list is empty");
            return;
        }
        if(head.next==null){
            head=head.next;
            tail =null;
            size--;
            return;
        }
        Node temp;
        temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println("Deleted node is : "+temp.next.data);
        temp.next=temp.next.next;
        size--;
    }

    void deleteForPosition(int pos){
        if (head == null) {
            System.out.println("can not delete because list is empty");
            return;
        }
        if(pos==1){
            deleteforbeginning();
        } 
        // if(pos<=0 || pos>size){
        //     System.out.println("Given position is not valid so can not delete any node.");
        //     return;
        // }
        int currPos=1;
        Node temp,prevNode;
        prevNode=null;
        temp=head;

        while(temp!=null){
            if(currPos==pos){
                System.out.println("Delete node is : "+temp.data);
                prevNode.next=temp.next;
                size--;
                return;
            }
            prevNode=temp;
            temp=temp.next;
            currPos++;
        }
        // while(currPos<pos-1){
        //     temp=temp.next;
        //     currPos++;
        // }
        // System.out.println("DEleted node is: "+temp.next.data);
        // temp.next=temp.next.next;
        // size--;
    }

    void deletevalue(int value){
        if(head==null){
            System.out.println("Can not delete beacouse List is empty");
            return;
        }
        if(head.data==value){
            System.err.println("Delete node is : "+head.data);
            head=head.next;
            size--;
            // deleteforbeginning();
            return;
        }
        Node temp,prevNode;
        prevNode=null;
        temp=head;
        while((temp!=null) && (temp.data != value)){
            prevNode=temp;
            temp=temp.next;
        }
        if(temp!=null){
            System.err.println("deleted node is: "+temp.data);
            prevNode.next= temp.next;
            size--;
        }
        else{
            System.err.println("No such node exits in the list.");
        }
    }
    
    void traverseLinkedList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size is : " + size);

    }

    public static void main(String[] args) {
        SinglyLL obj = new SinglyLL();
        obj.insertAtBeginning(10);
        // obj.insertAtBeginning(20);
        // obj.insertAtBeginning(30);
        // obj.insertAtBeginning(1);
        obj.insertAtEnd(100);
        obj.insertAtEnd(101);
        obj.insertAtPosition(25, 2);
        obj.insertAfterValue(189, 10);
        obj.traverseLinkedList();
        // obj.deleteforbeginning();
        // obj.traverseLinkedList();
        // obj.deleteForEnd();
        // obj.traverseLinkedList();
        // obj.deleteForPosition(3);
        obj.traverseLinkedList();
        obj.deletevalue(100);
        obj.traverseLinkedList();
    }
}
