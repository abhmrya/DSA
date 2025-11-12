public class arr04_insert {
    static void traverseArray(int arr[],int size){
        int i=0;
        while(i<size){
            System.out.println(arr[i]);
            i++;
        }
        System.out.println("**************************");

    }
    static void insertAtBeginning(int[] arr1,int size,int x){
        for(int i = size;i>0;i--){
            arr1[i]=arr1[i-1]; 
        }
        arr1[0]=x;
    }
    
   
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size=5;
        arr[0]=10;
        arr[1]=5;
        arr[2]=16;
        arr[3]=19;
        arr[4]=1;
        int element = 100;
        traverseArray(arr,size);
        insertAtBeginning(arr,size,element);
        size++;
        traverseArray(arr,size);

    }
}
