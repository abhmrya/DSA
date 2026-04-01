package DSAExercise.Stack;

public class StackUsingLL {
    Node top;
    public StackUsingLL(){
        this.top = null;
    }

    public  void push(int data ){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode; 
    }

    // public boolean isFull(){
    //     return top==stack
    // }
}
