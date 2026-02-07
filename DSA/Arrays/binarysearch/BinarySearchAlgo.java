package binarysearch;


public class BinarySearchAlgo {
    static int bisearch(int[] arr,int element){
        int low=0;
        int high = arr.length-1;
        while (low<=high) { 
            int mid = low+(high-low)/2;
            if(arr[mid]==element){
                return mid;
            }
            else if(arr[mid]<element){
                low=mid+1;
            }
            else if(arr[mid]>element){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,12,23,34,56,78,90,99};
        int element = 99;
        int result = bisearch(arr,element);
        if(result==-1){
            System.out.println("Element are not found.");
        }else{
            System.out.println("Element are present and index is : "+result);
        }
    }
}