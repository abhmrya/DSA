package DSAExercise.LinkedList.Test;

public class InsertBetween {
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

    void InsertBW(int data,int poss){
        Node newNode = new Node(data);
        if(poss<=0 || poss>size+1){
            System.out.println("Psition is not valid ");
            return ;
        }
        if(head == null){
            if(poss==1){
                insertBegin(data);
            }
        }
        if(poss==1){
            newNode.next=head;
            head=newNode;
            size++;
            return ;
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
        InsertBetween obj = new InsertBetween();
        obj.insertBegin(10);
        obj.insertBegin(20);
        obj.insertBegin(30);
        obj.insertBegin(40);
        obj.InsertOfEnd(100);
        obj.InsertOfEnd(200);
        obj.InsertOfEnd(300);
        obj.InsertOfEnd(400);
        obj.InsertBW(80,4);
        obj.traverseLinkedList();
    }
}
