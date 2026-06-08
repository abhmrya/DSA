import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int low,int high,int[] temp){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSort(arr, low,mid,temp);
            mergeSort(arr, mid+1, high, temp);
            merge(arr,low,mid,high,temp);
        }
    }

    static void merge(int[] arr,int low,int mid,int high,int[] temp){
        int i=low;int j=mid+1;int k=low;
        while(i<=mid && j<= high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=high){
            temp[k++]=arr[j++]; 
        }
        for(i=low;i<k;i++){
            arr[i]=temp[i];
        }
    }


    public static void main(String[] args) {
        int[] arr = {15,10,11,3,1,15,4,18,25,21};
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
}
