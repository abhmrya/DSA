package DSAExercise.LinkedList.Test;

public class InsertEnd {
    private Node head;
    private int size;

    void insertBegin(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
        size++;
    }

    void InsertOfEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            size++;
            return ;
        }
        Node temp;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
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
        InsertEnd obj = new InsertEnd();
        obj.insertBegin(10);
        obj.insertBegin(20);
        obj.insertBegin(30);
        obj.insertBegin(40);
        obj.InsertOfEnd(100);
        obj.InsertOfEnd(200);
        obj.InsertOfEnd(300);
        obj.InsertOfEnd(400);
        obj.traverseLinkedList();
    }
}
