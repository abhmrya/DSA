package DSAExercise.LinkedList.Assignment;

public class GetValueAtPosition {
    Node head;

    void GetValue(int poss){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        Node temp = head;

        int currentpos =1;

        while(temp.next!=null && currentpos<poss){
            temp = temp.next;
            currentpos++;
        }
        if(temp==null){
            System.out.println("Position out of range");
        }
        else{
            System.out.println("Position if "+poss + " value is : "+ temp.data);
        }
    }

    void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp;
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    

    public static void main(String[] args) {
        GetValueAtPosition obj = new GetValueAtPosition();
        obj.insert(11);
        obj.insert(12);
        obj.insert(13);
        obj.insert(14);
        obj.insert(15);
        obj.GetValue(4);
    }
}
