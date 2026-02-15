package DSAExercise.LinkedList.Test;

public class InsertBeginning {
    private Node head;
    private int size;

    void insertBeg(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
        size++;
    }

    void traverseNode(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node temp;
        temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            // System.out.println("temp"+temp);
            // System.out.println("Node"+Node.class);
            temp=temp.next;
        }
        System.out.println("\nSize is : "+size);
    }

    public static void main(String[] args) {
        InsertBeginning obj = new InsertBeginning();
        obj.insertBeg(10);
        obj.insertBeg(100);
        obj.insertBeg(1000);
        obj.insertBeg(10000);
        obj.traverseNode();
    }
}
