package DSAExercise.Stack;

public class StackUsingArray {
    protected int[] stackArray;
    protected int top;
    protected int maxSize;
    
    public StackUsingArray(int size){
        stackArray = new int[size];
        maxSize = size;
        top = -1;
    }

    public void push(int element){
        if(isFull()){
            resize();
                // System.out.println("Can not insert becase stack is full");
                // return;
        }
        top++;
        stackArray[top]=element;
    }

    public boolean isFull(){
        return top==(stackArray.length-1);
        // if(top==stackArray.length){
        //     return true;
        // }
        // return false;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Can not pop because stack is EMpty");
        }
        int x = stackArray[top];
        top--;
        return x;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Can not any peek value because stack is Empty");
        }
        return stackArray[top];
    }

    public void  display(){
        // for(int i : stackArray){
        //     System.out.println(stackArray[i]+" ");
        // }
        for(int i =0;i<=top;i++){
            System.out.println(stackArray[i]+" ");

        }
    }
    public void resize(){
        maxSize = maxSize*2;
        int[] newarr = new int[maxSize];
        for(int i=0;i<stackArray.length;i++){
            newarr[i]=stackArray[i];
        }
        stackArray=newarr;
    }
}
