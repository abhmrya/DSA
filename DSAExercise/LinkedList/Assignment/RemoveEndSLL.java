package DSAExercise.LinkedList.Assignment;

public class RemoveEndSLL {
    Node head;
    Node temp;

    void fiveNode(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
    }

    void removeEnd(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Node temp=head;
        Node prevNode=null;
        while(temp.next!=null){
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next=null;
        System.out.println("End Node removed node is : "+temp.data);
    }

    void traverse(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        RemoveEndSLL obj = new RemoveEndSLL();
        obj.fiveNode(11);
        obj.fiveNode(12);
        obj.fiveNode(13);
        obj.fiveNode(14);
        obj.fiveNode(15);

        obj.traverse();

        obj.removeEnd();
        obj.traverse();
    }
}