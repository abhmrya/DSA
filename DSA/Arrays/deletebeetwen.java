import java.util.Arrays;

public class deletebeetwen {
    static int[] deletelast(int[] arr,int size,int index){
        for (int i=index;i<size;i++) {
            arr[i]=arr[1+i];
        }
        size--;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size =5;
        int index=2;
        arr[0]=10;
        arr[1]=7;
        arr[2]=16;
        arr[3]=19;
        arr[4]=1;
        int result[] = deletelast(arr,size,index);
        System.out.println("After last element delete: ");
        System.out.println(Arrays.toString(result));
    }
}
