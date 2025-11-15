public class arr05_deletebeginning {
    static void display(int arr[],int size){
        for(int i = 0;i<=size-1;i++){
            System.out.print(arr[i]);
        }
    }

    static void deletebgn(int arr[],int size){
        for(int i = 0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=0;
        size--;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int size = 5;
        display(arr, size);
        deletebgn(arr,size);
        display(arr, size);
    }
}
