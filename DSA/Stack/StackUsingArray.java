package DSA.Stack;

public class StackUsingArray {
    protected int[] stackArray;
    protected int top;
    protected int maxSize;

    public StackUsingArray(int size) {
        maxSize=size;
        stackArray = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            resize();
            // System.out.println("Can not insert becouse stack is full.");
            // return;
        }
        top++;
        stackArray[top] = element;
    }

    boolean isFull() {
        return top == (stackArray.length - 1);
        // if(top==stackArray.length-1){
        // return true;
        // }
        // return false;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            // System.out.println("Can not pop becouse stack is empty.");
            throw new Exception("Can not pop becouse stack is empty.");
        }
        int x = stackArray[top];
        top--;
        return x;
    }

    boolean isEmpty() {
        return top == -1;
        // if(top==-1) return true;
        // return false;
    }

    int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can not peek becouse stack is empty.");
        }
        int x = stackArray[top];
        return x;
    }

    public void resize(){
        maxSize=maxSize*2;
        int [] newArray = new int[maxSize];
        for(int i=0;i<stackArray.length;i++){
            newArray[i]=stackArray[i];
        }
        stackArray=newArray;
    }
}