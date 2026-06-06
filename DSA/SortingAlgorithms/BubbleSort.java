package DSA.SortingAlgorithms;
import  java.util.Arrays;

public class BubbleSort {
    
    static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=arr[i];
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,4,8,6,43,35,87,53};
        bubbleSort(arr,arr.length);
        System.out.println("sorted arr : "+Arrays.toString(arr));
    }
}
