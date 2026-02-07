
import java.util.Arrays;

public class DeleteLast {
    static int[] deletelast(int[] arr,int size){
        arr[size-1]=0;
        size--;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size =5;
        arr[0]=10;
        arr[1]=7;
        arr[2]=16;
        arr[3]=19;
        arr[4]=1;
        int result[] = deletelast(arr,size);
        System.out.println("After last element delete: ");
        System.out.println(Arrays.toString(result));
    }
}
