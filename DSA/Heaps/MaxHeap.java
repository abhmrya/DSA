package DSA.Heaps;

import  java.util.ArrayList;

public class MaxHeap {
    // int[] heapArr;
    // int capacity;
    // int size;

    // MaxHeap(int capacity){
    //     this.capacity = capacity;
    //     heapArr = new int[capacity];
    //     size=0;
    // }

    // int parent(int i){
    //     return (i-1)/2;
    // }

    // int leftChild(int i){
    //     return 2*i+1;
    // }

    // int rightChild(int i){
    //     return 2*(i+1);
    // }

    // void swap(int i , int j){
    //     int temp = heapArr[i];
    //     heapArr[i]=heapArr[j];
    //     heapArr[j]=temp;
    // }

    // void insert(int val){
    //     heapArr[size] = val;
    //     int i=size;
    //     size++;
    //     while(i!=0 && heapArr[i] > heapArr[parent(i)]){
    //         swap(i,parent(i));
    //         i = parent(i);
    //     }
    // }

    // void displayHeap(){
    //     for(int i=0;i<size;i++){
    //         System.out.print(heapArr[i]+" ");
    //     }
    // }

    // void delete(){
    //     if(size==0){
    //         System.out.println("Heap is Empty.");
    //         return;
    //     }
    //     heapArr[0]=heapArr[size-1];
    //     size--;
    //     int i=0;
    //     while(true){
    //         int leftchild = leftChild(i);
    //         int rightchild = rightChild(i);
    //         int maxIndex =i;
    //         if(leftchild<size && heapArr[leftchild]>heapArr[maxIndex]){
    //             maxIndex = leftchild;
    //         }
    //         if(rightchild<size && heapArr[rightchild]>heapArr[maxIndex]){
    //            maxIndex = rightchild;
    //         }
    //         if(i!=maxIndex){
    //             swap(i, maxIndex);
    //             i = maxIndex;
    //         }else{
    //             break;
    //         }
    //     }
    // }

    // using List 
    ArrayList<Integer> arrHeap;
    int size;

    MaxHeap(){
        arrHeap = new ArrayList<>();
        size=0;
    }
    int leftChild(int i){
        return 2*i+1;
    }

    int rightChild(int i){
        return 2*(i+1);
    }

    int parent(int i){
        return( i-1)/2;
    }

    void swap(int i,int j){
        int temp = arrHeap.get(j);
        arrHeap.set(j, arrHeap.get(i));
        arrHeap.set(i, temp);
    }

    // int i=0;
    void insert(int value){
        arrHeap.add(value);
        int i=size;
        size++;
        while(i!=0 && arrHeap.get(i)>arrHeap.get(parent(i))){
            swap(i,parent(i));
            i=parent(i);
        }
    }

    void displayHeap(){
        for(int i=0;i<size;i++){
            System.out.print(arrHeap.get(i)+" ");
        }
    }

    void delete(){

        if(size == 0){
            System.out.println("Heap is Empty.");
            return;
        }

        arrHeap.set(0, arrHeap.get(size-1));
        arrHeap.remove(size - 1);
        size--;
        int i=0;
        while(true){
            int maxIndex=i;

            int leftchild=leftChild(i);
            int rightchild = rightChild(i);

            if(leftchild<size && arrHeap.get(leftchild)>arrHeap.get(maxIndex)){
                maxIndex=leftchild;
            }if(rightchild<size && arrHeap.get(rightchild)>arrHeap.get(maxIndex)){
                maxIndex =rightchild;
            }
            if(i!=maxIndex){
                swap(i, maxIndex);
                i = maxIndex;
            }else{
                break;
            }
        }
    }
}
