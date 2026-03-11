package DSAExercise.LinkedList.Test2;

public class InsertBeginning {
    Node head;
    private int size;

    public void InsertBeg(int data){
        Node NewNode = new Node(data);
        NewNode.Next = head;
        head = NewNode;
        size++;
    }

    public void traverse(){
        if(head==null){
            System.out.println("List is Empty.");
        }
        Node temp;
        temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.Next;
        }
        System.out.println("\nSize is : "+size);
    }

    public  void  InsertBetwe(int data,int pos){
        Node newNode = new Node(data);
        if(head==null){
            if(pos==1){
                InsertBeg(data);
                return;
            }
        }

        if(pos<=0 || pos >size+1){
            System.out.println("Pos is not valid.");
            return;
        }

        Node temp;
        temp = head;
        int i = 1;
        while(i<pos-1){
            temp = temp.Next;
            i++;
        }

        newNode.Next=temp.Next;
        temp.Next = newNode;
        size++;  
    }

    public void insertAftVal(int data,int value){
        Node newNode = new Node(value);
        Node temp;
        temp=head;
        while(temp.data!=data){
            temp=temp.Next;
        }
        if(temp.data==data){
            newNode.Next=temp.Next;
            temp.Next=newNode;
        }
        size++;
    }

    // public static void main(String[] args) {
    //     InsertBeginning obj = new InsertBeginning();
    //     obj.InsertBeg(12);
    //     obj.InsertBeg(32);
    //     obj.InsertBeg(142);
    //     obj.InsertBeg(54);
    //     obj.InsertBeg(3);
    //     obj.InsertBeg(2);

    //     obj.InsertBetwe(1000,2);
    //     obj.insertAftVal(1000,1111);

    //     obj.traverse();
    // }
}
