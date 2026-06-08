import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr ,int low,int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }
    
    static int  partition(int[] arr , int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while (i<=high-1 && arr[i]<=pivot) {
                i++; 
            }
            while (j>=low+1 && arr[j]>pivot) { 
                j--;
            }
            if(j>i){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {65,43,76,98,43,25,45,23,83,45};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}