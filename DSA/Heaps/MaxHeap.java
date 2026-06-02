package DSA.Heaps;

public class MaxHeap {
    int[] heapArr;
    int capacity;
    int size;

    MaxHeap(int capacity){
        this.capacity = capacity;
        heapArr = new int[capacity];
        size=0;
    }

    int parent(int i){
        return (i-1)/2;
    }

    int leftChild(int i){
        return 2*i+1;
    }

    int rightChild(int i){
        return 2*(i+1);
    }

    void swap(int i , int j){
        int temp = heapArr[i];
        heapArr[i]=heapArr[j];
        heapArr[j]=temp;
    }

    void insert(int val){
        heapArr[size] = val;
        int i=size;
        size++;
        while(i!=0 && heapArr[i] > heapArr[parent(i)]){
            swap(i,parent(i));
            i = parent(i);
        }
    }

    void displayHeap(){
        for(int i=0;i<size;i++){
            System.out.println(heapArr[i]+"");
        }
    }
}
