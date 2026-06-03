package DSA.Heaps;

public class BuildMinHeap {
    int[] heapArr;

    public BuildMinHeap() {
        heapArr=new int[50];
    }

    void buildMinHeap(int[] arr,int size){
        for(int i=0;i<size;i++){
            insert(arr,i);
        }
    }

    int parent(int i){
        return (i-1)/2;
    }

    void swap(int i , int j){
       int temp = heapArr[i];
        heapArr[i]=heapArr[j];
        heapArr[j]=temp;
    }

    void insert(int[] arr,int i){
        while(i!=0 && arr[i]<arr[parent(i)] ){
                swap(i,parent(i));
                i=parent(i);
        }
    }    

    void displayHeap(){
        for(int i=0;i<heapArr.length;i++){
            System.out.println(heapArr[i]+" ");
        }
        System.out.println();
    }
}
