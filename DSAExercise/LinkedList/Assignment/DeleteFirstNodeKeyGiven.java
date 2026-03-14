package DSAExercise.LinkedList.Assignment;

public class DeleteFirstNodeKeyGiven {
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

    void removeKeyNode(int key){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty.");
            return;
        }

        while(temp.data!=key){
            temp = temp.next;
        }
        temp.next=temp.next.next;
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
        DeleteFirstNodeKeyGiven obj = new DeleteFirstNodeKeyGiven();
        obj.fiveNode(11);
        obj.fiveNode(12);
        obj.fiveNode(13);
        obj.fiveNode(14);
        obj.fiveNode(15);

        obj.traverse();

        obj.removeKeyNode(2);
        obj.traverse();
    }
}