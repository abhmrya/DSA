import java.util.Arrays;

public class CountSort2 {
    static void countSort(int[] arr, int n){
        int max = findMax(arr,n);
        int[] count = new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        // m-2

        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        int[] output = new int[n];
        for(int j=n-1;j>=0;j--){
            output[count[arr[j]]-1]=arr[j];
            count[arr[j]]--;
        }
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
        
    }
    static int findMax(int[] arr ,int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,2,1,8,8,2,5,9,1,0,8};
        countSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
