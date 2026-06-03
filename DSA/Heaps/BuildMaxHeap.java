package DSA.Heaps;

public class BuildMaxHeap {
    int[] heapArr;

    public BuildMaxHeap() {
        heapArr=new int[50];
    }
    

    private int parent(int i){
        return (i-1)/2;
    }
    
    void buildMaxHeap(int[] arr,int size){
        for(int i=0;i<size;i++){
            insert(arr,i);
        }
    }

    void swap(int i , int j){
        int temp = heapArr[i];
        heapArr[i]=heapArr[j];
        heapArr[j]=temp;
    }

    private void insert(int[] arr,int i){
        while(i>0 && arr[i] > arr[parent(i)]){
            swap(i, parent(i));
            // swap(arr,i,parent(i));
            i = parent(i);
        }
    }

    void displayHeap(){
        for(int i=0;i<heapArr.length;i++){
            System.out.print(heapArr[i]+" ");
        }
        System.out.println();
    }
}
