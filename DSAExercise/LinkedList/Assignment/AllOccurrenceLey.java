package DSAExercise.LinkedList.Assignment;

public class AllOccurrenceLey {
    Node head;
    Node temp;

    void insert(int data){
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
        Node prevNode=null;
        
        if(head==null){
            System.out.println("List is empty.");
            return;
        }

        while(temp!=null){
            if(temp.data==key){
                if(prevNode==null){
                    head=temp.next;
                }else{
                prevNode.next=temp.next;
                }
            }else{
                prevNode=temp;
            }
            temp = temp.next;
            
        }
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
        AllOccurrenceLey obj = new AllOccurrenceLey();
        obj.insert(11);
        obj.insert(12);
        obj.insert(13);
        obj.insert(12);
        obj.insert(15);
        obj.insert(12);
        obj.insert(12);
        obj.insert(12);
        obj.insert(12);

        obj.traverse();

        obj.removeKeyNode(12);
        obj.traverse();
    }
}
