public class InsertBeginning {
    static void insertbegin(int[] arr,int element,int size){
        for (int i=size-1;i>=0;i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=element;
        size++;
        
        for (int i=0;i<size;i++) {
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size=5;
        arr[0]=32;
        arr[1]=21;
        arr[2]=4;
        arr[3]=21;
        arr[4]=65;
        
        int element = 100;

        insertbegin(arr, element,size);
    }
}
