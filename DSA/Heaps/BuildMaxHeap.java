package DSA.Heaps;

public class BuildMaxHeap {

    // Approach 1 : Insertion Method (top Down Approch)
    // int[] heapArr;

    // public BuildMaxHeap() {
    //     heapArr=new int[50];
    // }
    

    // private int parent(int i){
    //     return (i-1)/2;
    // }
    
    // void buildMaxHeap(int[] arr,int size){
    //     for(int i=0;i<size;i++){
    //         insert(arr,i);
    //     }
    // }

    // void swap(int i , int j){
    //     int temp = heapArr[i];
    //     heapArr[i]=heapArr[j];
    //     heapArr[j]=temp;
    // }

    // private void insert(int[] arr,int i){
    //     while(i>0 && arr[i] > arr[parent(i)]){
    //         swap(i, parent(i));
    //         // swap(arr,i,parent(i));
    //         i = parent(i);
    //     }
    // }

    // Approch 2 : HEapify (bottom up approach)

    void buildMaxHeap(int[] arr,int size){
        int startIndex = (size/2)-1;
        for(int i=startIndex;i>=0;i--){
            heapify(arr,i,size);
        }
    }

    void heapify(int[] arr,int i,int n){
        // while(true){
            int maxIndex=i;
            int left = 2*i+1;
            int right = 2*i+2;
            if(left < n && arr[left]>arr[maxIndex]){
                maxIndex=left;
            }
            if(right<n && arr[right] > arr[maxIndex]){
                maxIndex=right;
            }

            if(maxIndex!=i){
                swap(arr,i,maxIndex);
            //     i = maxIndex;
            // }else{
            //     break;
            // }
                heapify(arr, maxIndex, n); 
        } 
    }

    void swap(int[] arr , int i,int j){
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
