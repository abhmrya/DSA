public class inserbetween {
    static void inserbw(int[] arr,int size,int element,int index){
        for (int i = size-1; i>=index; i--) {
            arr[i+1]=arr[i];
        }
        arr[index]=element;
        size++;
        for (int i = 0; i<size; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr =new int[10];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;
        int size=5;
        int element=100;
        int index=2;
        inserbw(arr,size,element,index);

    }
}
