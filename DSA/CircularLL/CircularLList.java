package DSA.CircularLL;

public class CircularLList {
    private Node head;
    private Node tail;
    private int size;

    Node insertbeginning(int data) {
        Node newNode = new Node(data);
        // if (head == null) {
        // head = newNode;
        // tail=newNode;
        // head.next = head;
        // size++;
        // return head;
        // }
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
            size++;
            return tail;
        }
        // case 1: we have both head and tail
        /*
         * tail.next=newNode;
         * newNode.next = head;
         * head=newNode;
         * size++;
         * return head;
         */

        // Case 2 : we have only head
        // Node temp = head;
        // do {
        // temp=temp.next;

        // } while (temp.next!=head);
        // temp.next=newNode;
        // newNode.next=head;
        // size++;
        // return head;

        // Case 3 : only given tail
        head = tail.next;
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
        size++;
        return head;
    }

    Node insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            size++;
            return head;
        }
        // case 1: we have both head and tail
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
        return head;
    }

    Node insertAfterValue(int data,int value){
        Node newNode = new Node(data);
        if(head==null){
            System.out.println("No such value exist.");
            return head;
        }
        if(head.data==value){
            newNode.next = head.next;
            head.next = newNode;
            size++;
            return head;
        }
        Node temp =head;
        do { 
            if(temp.data==value){
                break;
            }
            temp=temp.next;
        } while (temp!=head);
        if(temp==head){
            System.out.println("Node such value exist.");
            return head;
        }
        newNode.next=temp.next;
        temp.next = newNode;
        size++;
        return head;
    }

    Node insertBeforePosition(int data,int pos){
        Node newNode = new Node(data);
        if(pos<=0){
            System.out.println("Position is not valid.So can not insert");
            return head;
        }
        if(pos==1){
            return insertbeginning(data);
        }
        Node temp;
        Node prevNode=null;
        int currposition=1;
        temp=head;
        do { 
            if(currposition==pos){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            currposition++;
        } while (temp!=head);
        if(temp==head){
            System.out.println("Not a valid possition.");
            return head;
        }
        newNode.next = prevNode.next;
        prevNode.next=newNode;
        size++;
        return head;
    }

    Node deleteFromHead(Node head){
        if(head==null){
            System.out.println("List is empty so can not delete.");
            return head;
        }
        if(head.next==head){
            head.next=null;
            head = null;
            tail = null;
            size--;
            return head;
        }

        // case 1 : we have both head and tail
        // Node temp=head;

        tail.next = head.next;
        head.next = null;
        head = tail.next;
        size--;
        return head;

        // CAse 2: we have only head
        // Node temp = head;
        // while (temp.next!=head) {
        //     temp= temp.next;
        // }
        // temp.next = head.next;
        // head.next = null;
        // head = temp.next;
        // size--;
        // return head;

        // Case 3 : we have only tail
        // Node temp = tail.next;
        // tail.next = temp.next;
        // temp.next=null;
        // return tail;
    }

    Node delelteFromEnd(Node head){
        if(head==null){
            System.out.println("List is empty so can not delete.");
            return head;
        }
        if(head.next==head){
            head.next=null;
            head = null;
            tail = null;
            size--;
            return head;
        }

        // Case 1: we have both head and tail
        Node temp = head;
        while (temp.next.next!=head) {
            temp = temp.next;
        }
        Node nextNode=temp.next;
        temp.next = nextNode.next;
        nextNode.next = null;
        tail=temp;
        size--;
        return head;

        // Node prevNode=null;
        // do { 
        //     prevNode=temp;
        //     temp=temp.next;
        // } while (temp.next!=head);
        // prevNode.next = temp.next;
        // tail= prevNode;
        // temp.next=null;
        // size--;
        // return head;
    }

    Node deleleFromPoss(Node head,int poss){
        if(head==null){
            System.out.println("List is empty.");
            return head;
        }
        if(poss==1){
            return deleteFromHead(head);
        }
        Node temp=head;
        Node prevNode =null;
        int currPosition=1;
        do { 
            if(currPosition==poss){
                break;
            }
            currPosition++;
            prevNode=temp;
            temp=temp.next;
            
        } while (temp!=head);
        if(temp==head){
            System.out.println("Invalid possition.");
            return head;
        }
        prevNode.next = temp.next;
        // if deleting tail → update tail
        if(temp==tail){
            tail=prevNode;
        }
        temp.next=null;
        size--;
        return head;
    }

    Node deleteFromValue(Node head,int value){
        if(head==null){
            System.out.println("Empty List.");
            return head;
        }
        if(head.data==value){
            return deleteFromHead(head);
        }
        Node temp=head;
        Node prevNode=null;
        do { 
            if(temp.data==value){
                break;
            }
            prevNode=temp;
            temp=temp.next;
            
        } while (temp!=head);

        if(temp==head){
            System.out.println("Value not found.");
            return head;
        }

        prevNode.next=temp.next;
        if(temp==tail){
            tail=prevNode;
        }
        temp.next=null;
        size--;

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
        Node head = null;
        CircularLList obj = new CircularLList();
        head = obj.insertbeginning(10);
        head = obj.insertbeginning(20);
        head = obj.insertbeginning(40);
        head = obj.insertbeginning(50);
        head = obj.insertAtEnd(60);
        // obj.traverseCLL(head);
        // head = obj.insertBeforePosition(35, 3);
        // obj.traverseCLL(head);
        // head=obj.insertAfterValue(45,40);
        // obj.traverseCLL(head);
        // head= obj.deleteFromHead(head);
        // obj.traverseCLL(head);
        // head =obj.delelteFromEnd(head);
        // obj.traverseCLL(head);
        // head =obj.deleleFromPoss(head,3);
        obj.traverseCLL(head);
        head = obj.deleteFromValue(head,10);
        obj.traverseCLL(head);
    }
}
