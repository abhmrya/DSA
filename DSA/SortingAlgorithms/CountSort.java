import java.util.Arrays;

public class CountSort {
    static void countSort(int[] arr, int n){
        int max = findMax(arr,n);
        int[] count = new int[max+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j++]=i;
                count[i]--;
            }
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
