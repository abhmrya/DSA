

import  java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr, int n){
        for(int i=0;i<n;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,10,1,6,1};
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
}
}