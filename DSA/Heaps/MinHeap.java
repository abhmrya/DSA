package DSA.Heaps;

import java.util.ArrayList;

public class MinHeap {
    //  this is with arr
    /* 
    int[] heapArr;
    int capacity;
    int size;

    MinHeap(int capacity){
        this.capacity = capacity;
        this.heapArr = new int[capacity];
        size=0;
    }

    public int parent(int i){
        return (i-1)/2;
    }

    public int swap(int[] heapArr,int i){
        int temp = heapArr[i];
        heapArr[i]=heapArr[parent(i)];
        heapArr[parent(i)]=temp;
        return parent(i);
    }

    public void insertMin(int value) throws Exception{
        if(size==capacity){
            throw new Exception("Heap is full. Can not insert more element. ");
        }
        heapArr[size]=value;
        int i=size;
        size++;
        while(i!=0 && heapArr[i]<heapArr[parent(i)]){
            i = swap(heapArr,i);
        }
    }

    void displayHeap(){
        for(int i=0;i<size;i++){
            System.out.println(heapArr[i]+"");
        }
    }

    */

    // With ArrayList
    ArrayList<Integer> heapList;
    int size =0;

    MinHeap(){
        heapList = new ArrayList<>();
        size=0;
    }

     public int parent(int i){
        return (i-1)/2;
    }

    void swap(int i,int j){
       int temp = heapList.get(i);
        heapList.set(i, heapList.get(j));
        heapList.set(j, temp);

       }


    void insertMin(int value){
        heapList.add(value);
        int i=size;
        size++;
        while(i!=0 && heapList.get(i)<heapList.get(parent(i))){
        swap(i,parent(i));
        i =parent(i);
        }
    }

    void displayHeap(){
        System.out.println(heapList);
    }


}
