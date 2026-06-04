package DSA.Heaps;

public class HeapSort {

    void heapSort(int[] arr,int size){

        // 1. Bilding Max Heap
        for(int i=(size-1)/2;i>=0;i--){
            heapify(arr,i,size);
        }

        // 2. Delete One By One All Nodes
        for(int i=size-1;i>0;i--){
            swap(arr,0,i);
            heapify(arr, 0, i);
        }
    }

    void heapify(int[] arr, int i,int size){
        int maxIndex=i;
        int left = 2*i+1;
        int right = 2*(i+1);

        if(left<size && arr[left]>arr[maxIndex]){
            maxIndex = left;
        }
        if(right<size && arr[right]>arr[maxIndex]){
            maxIndex = right;
        }
        if(i!=maxIndex){
            swap(arr,i,maxIndex);
            heapify(arr, maxIndex,size);
        }
    }

    void swap(int[] arr , int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void displayHeap(int[] heapArr){
        for(int i=0;i<heapArr.length;i++){
            System.out.print(heapArr[i]+" ");
        }
        System.out.println();
    }
}
