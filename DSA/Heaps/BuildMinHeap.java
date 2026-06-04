package DSA.Heaps;

public class BuildMinHeap {
    int[] heapArr;

    public BuildMinHeap() {
        heapArr=new int[50];
    }

    // void buildMinHeap(int[] arr,int size){
    //     for(int i=0;i<size;i++){
    //         insert(arr,i);
    //     }
    // }

    // int parent(int i){
    //     return (i-1)/2;
    // }

    // void swap(int i , int j){
    //    int temp = heapArr[i];
    //     heapArr[i]=heapArr[j];
    //     heapArr[j]=temp;
    // }

    // void insert(int[] arr,int i){
    //     while(i>0 && arr[i]<arr[parent(i)] ){
    //             swap(i,parent(i));
    //             i=parent(i);
    //     }
    // }    

    void buildMinHeap(int[] arr, int size){
        int startIndex = (size/2)-1;
        for(int i=startIndex;i>=0;i--){
            heapify(arr,i,size);
        }
    }

    void heapify(int[] arr, int i,int size){
        int minIndex = i;
        int left = 2*i+1;
        int right = 2*(i+1);

        if(left<size && arr[left]<arr[minIndex]){
            minIndex = left;
        }if(right<size && arr[right]<arr[minIndex]){
            minIndex = right;
        }
        if(i!=minIndex){
            swap(arr,i,minIndex);
            heapify(arr, minIndex, size);
        }
    }

    void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }

    int parent(int i){
        return (i-1)/2;
    }

    void displayHeap(){
        for(int i=0;i<heapArr.length;i++){
            System.out.print(heapArr[i]+" ");
        }
        System.out.println();
    }
}
