package DSA.doublyLL;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size=0;

    void insertBeginning(int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        Node temp=head;
        newNode.nextNode=temp;
        temp.prevNode=newNode;
        head=newNode;
        size++;
    }

    void insertEnd(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }

        Node temp=head;

        while(temp.nextNode!=null){
            temp=temp.nextNode;
        }
        temp.nextNode=newNode;
        newNode.prevNode=temp;
        tail = newNode;
        size++;
    }

    void insertBetween(int data,int poss){

        if(poss <= 0){
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }

        if(poss == 1){
            newNode.nextNode = head;
            head.prevNode = newNode;
            head = newNode;
            size++;
            return;
        }

        Node temp=head;
        int curentposs=1;

        while (temp!=null && curentposs<poss-1){
            temp=temp.nextNode;
            curentposs++;
        }

        if(temp==null){
            System.out.println("Position out of range");
            return;
        }

        Node nextTemp=temp.nextNode;

        newNode.nextNode=nextTemp;
        newNode.prevNode=temp;
        temp.nextNode=newNode;

        if(nextTemp!=null){
            nextTemp.prevNode=newNode;
        }else{
            tail=newNode;
        }

        size++;
    }

    void afterValue(int data, int value){

        Node newNode = new Node(data);

        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null && value!=temp.data){
            temp=temp.nextNode;
        }
        if(temp==null){
            System.out.println("Value is not found.");
            return;
        }

        Node nextTempNode=temp.nextNode;

        newNode.nextNode=nextTempNode;
        newNode.prevNode=temp;
        temp.nextNode=newNode;

        if(nextTempNode!=null){
            nextTempNode.prevNode=newNode;
        }else{
            tail = newNode;
        }
        size++;
    }

    void travers(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp =temp.nextNode;
        }
        System.out.println("End");
        System.out.println("Size is : "+size);
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertBeginning(100);
        obj.insertBeginning(200);
        obj.insertBeginning(300);
        obj.insertBeginning(400);
        obj.insertBeginning(500);

        obj.travers();

        obj.insertEnd(600);
        obj.travers();

        obj.insertBetween(1000,4);
        obj.travers();

        obj.afterValue(1111,300);
        obj.travers();

    }
}