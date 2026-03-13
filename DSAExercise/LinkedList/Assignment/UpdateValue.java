package DSAExercise.LinkedList.Assignment;

public class UpdateValue {
    Node head;
    int data;

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

    void updateForValue(int data,int poss){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        Node temp =head;
        int curentposs =1;
        while (temp!=null && curentposs < poss) { 
            temp = temp.next;
            curentposs++;
        }
        if(temp == null){
        System.out.println("Position out of range");
        return;
        }
        temp.data=data;
    }

    void traverse(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.err.println("End");
    }

    public static void main(String[] args) {
        UpdateValue obj = new UpdateValue();
        obj.insert(11);
        obj.insert(12);
        obj.insert(13);
        obj.insert(14);
        obj.insert(15);

        obj.traverse();

        obj.updateForValue(20,2);
        obj.traverse();
    }
}
