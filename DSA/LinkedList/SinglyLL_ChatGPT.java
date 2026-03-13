package DSA.LinkedList;

public class SinglyLL_ChatGPT {
    private Node head;
    private Node tail;
    private int size;

    // Insert at Beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    // Insert at End
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            insertAtBeginning(data);
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Insert at Position
    void insertAtPosition(int data, int pos) {

        if (pos <= 0 || pos > size + 1) {
            System.out.println("Position not valid");
            return;
        }

        if (pos == 1) {
            insertAtBeginning(data);
            return;
        }

        if (pos == size + 1) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;
        int curr = 1;

        while (curr < pos - 1) {
            temp = temp.next;
            curr++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Insert after value
    void insertAfterValue(int data, int value) {
        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }

        size++;
    }

    // Delete from Beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Deleted node: " + head.data);
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    // Delete from End
    void deleteFromEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            System.out.println("Deleted node: " + head.data);
            head = null;
            tail = null;
            size--;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        System.out.println("Deleted node: " + temp.next.data);
        temp.next = null;
        tail = temp;
        size--;
    }

    // Delete by Position
    void deleteForPosition(int pos) {

        if (pos <= 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;
        int curr = 1;

        while (curr < pos - 1) {
            temp = temp.next;
            curr++;
        }

        System.out.println("Deleted node: " + temp.next.data);

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Delete by Value
    void deleteValue(int value) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            deleteFromBeginning();
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        System.out.println("Deleted node: " + temp.next.data);

        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
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

        SinglyLL_ChatGPT obj = new SinglyLL_ChatGPT();
        
        obj.insertAtBeginning(10);
        obj.insertAtEnd(100);
        obj.insertAtEnd(101);
        obj.insertAtPosition(25, 2);
        obj.insertAfterValue(189, 10);

        obj.traverse();

        obj.deleteValue(100);

        obj.traverse();
    }
}
