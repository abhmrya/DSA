package DSA.Stack;

public class StackUsingLL {
    private Node top;
    public StackUsingLL(){
        this.top = null;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top = newNode;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not pop becousse list is empty");
        }
        int x = top.data;
        top = top.next;
        return x;
    }

    boolean isEmpty(){
        return top==null;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can not peek becousse list is empty");
        }
        return top.data;
    }

    public static void main(String[] args) {
        try {
        StackUsingLL stack = new StackUsingLL();
        stack.push(12);
        stack.push(22);
        stack.push(192);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        // System.out.println(stack.peek());
        

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        } catch (Exception e) {
            System.out.println(e);
    }
}
}
