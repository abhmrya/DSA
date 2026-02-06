import java.util.Arrays;


public class SentinelLinearSearch {
    static int FindElement(int[] arr,int element){
        int n = arr.length;
        int last = arr[n-1];
        arr[n-1]=element;
        int i=0;
        while (arr[i]!=element) {
            i++;
        }
        arr[n-1]=last;
        if(i<n-1 || arr[n-1]==element){
            return i;
        }
        else{
            return -1;
        }
}
    public static void main(String[] args) {
        int[] arr = new int[] {23,43,56,76,45,93,65,43};
        int element =76;

        int result = FindElement(arr,element);
        System.out.println("Modify element is : "+Arrays.toString(arr));
        if (result==-1){
            System.out.println("element not found!");
        }else{
            System.out.println("Element index is : "+result);
        }
    }
}
