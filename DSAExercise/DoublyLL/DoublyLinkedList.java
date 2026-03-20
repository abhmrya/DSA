package DSAExercise.DoublyLL;

class Node {
    int data;
    Node nextNode;
    Node prevNode;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    // Insert at beginning
    void insertBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.nextNode = head;
            head.prevNode = newNode;
            head = newNode;
        }
        size++;
    }

    // Insert at end (optimized using tail)
    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.nextNode = newNode;
            newNode.prevNode = tail;
            tail = newNode;
        }
        size++;
    }

    // Insert at position
    void insertBetween(int data, int pos) {
        if (pos <= 0 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            insertBeginning(data);
            return;
        }

        if (pos == size + 1) {
            insertEnd(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.nextNode;
        }

        Node newNode = new Node(data);
        Node next = temp.nextNode;

        temp.nextNode = newNode;
        newNode.prevNode = temp;
        newNode.nextNode = next;
        next.prevNode = newNode;

        size++;
    }

    // Insert after value
    void afterValue(int data, int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.nextNode;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);
        Node next = temp.nextNode;

        temp.nextNode = newNode;
        newNode.prevNode = temp;
        newNode.nextNode = next;

        if (next != null) {
            next.prevNode = newNode;
        } else {
            tail = newNode;
        }

        size++;
    }

    // Delete from beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.nextNode == null) {
            head = tail = null;
        } else {
            head = head.nextNode;
            head.prevNode = null;
        }
        size--;
    }

    // Delete from end (optimized)
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.nextNode == null) {
            head = tail = null;
        } else {
            tail = tail.prevNode;
            tail.nextNode = null;
        }
        size--;
    }

    // Delete from position
    void deleteFromPosition(int pos) {
        if (pos <= 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            deleteFromBeginning();
            return;
        }

        if (pos == size) {
            deleteFromEnd();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.nextNode;
        }

        Node prev = temp.prevNode;
        Node next = temp.nextNode;

        prev.nextNode = next;
        next.prevNode = prev;

        size--;
    }

    // search 
    boolean searchDLL(Node head,int value){
        if(head==null){
            return false;
        }
        //case 1 : we have only head
        /* Node temp =head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp = temp.nextNode;
        }
        return false; */

        // Case 2 :  we have both head and tail
        while(head!=tail && head.prevNode!=tail){
            if(head.data==value || tail.data==value){
                return true;   
            }
            head = head.nextNode;
            tail = tail.prevNode;
        }
        if(head==tail && head.data==value){
            return true;
        }
        return false;
    }

    Node reverse(Node head) {
    if (head == null) return null;

    Node temp = null;
    Node current = head;

    // Swap next and prev
    while (current != null) {
        temp = current.prevNode;
        current.prevNode = current.nextNode;
        current.nextNode = temp;

        current = current.prevNode;
    }

    // Fix new head
    if (temp != null) {
        head = temp.prevNode;
    }

    return head;
}

    boolean isPalindrome(Node head){
        if(head==null){
            return false;
        }
        while(head!=tail && head.prevNode!=tail){
            if(head.data!=tail.data){
                return false;   
            }
            head = head.nextNode;
            tail = tail.prevNode;
        }
        return true;
    }

    // Traverse
    void traverse(Node head) {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.nextNode;
        }
        System.out.println("END");
        System.out.println("Size: " + size);
    }

    void traverse() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.nextNode;
        }
        System.out.println("END");
        System.out.println("Size: " + size);
    }

    // MAIN
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        Node head =null;
        obj.insertBeginning(100);
        obj.insertBeginning(200);
        obj.insertBeginning(100);
        obj.insertBeginning(400);
        obj.insertBeginning(500);

        obj.traverse();

        // obj.insertEnd(600);
        // obj.traverse();

        // obj.insertBetween(1000, 4);
        // obj.traverse();

        // obj.afterValue(1111, 300);
        // obj.traverse();

        // obj.deleteFromBeginning();
        // obj.deleteFromBeginning();
        // obj.traverse();

        // obj.deleteFromEnd();
        // obj.traverse();

        // obj.deleteFromPosition(3);
        // obj.traverse();

        // System.out.println(obj.searchDLL(obj.head, 400));

        // obj.head = obj.reverse(obj.head);
        // obj.traverse(obj.head);

        System.out.println(obj.isPalindrome(obj.head));
    }
}