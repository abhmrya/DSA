

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr,int n){
        
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                swap(arr,i,minIndex);
            }
        }
    }
    static void swap(int[] arr,int i,int minIndex){
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    public static void main(String[] args) {
        int[] arr = {4,3,5,8,5,2,5};
        selectionSort(arr, arr.length);
        System.out.println("Selection Sort : "+Arrays.toString(arr));
    }
}
