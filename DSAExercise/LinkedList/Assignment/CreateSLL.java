package DSAExercise.LinkedList.Assignment;

public class CreateSLL {
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

    void traverse(){
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        CreateSLL obj = new CreateSLL();
        obj.fiveNode(11);
        obj.fiveNode(12);
        obj.fiveNode(13);
        obj.fiveNode(14);
        obj.fiveNode(15);

        obj.traverse();
    }
}
