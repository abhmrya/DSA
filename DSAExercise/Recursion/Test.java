package DSAExercise.Recursion;

public class Test {
    static int binarysearch(int[] arr ,int element ,int low,int high){
        if(low>high) return -1;
        int mid = low+(high-low)/2;
        if(arr[mid]==element) return mid;
        if(arr[mid]<element){
            return binarysearch(arr, element, mid+1,high);
        }
        else{
            return binarysearch(arr, element, low, mid-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3, 5, 7, 9};
        int element=7;
        int low=0;
        int high=arr.length-1;
        int result = binarysearch(arr,element,low,high);
        System.out.println("Result : "+result);
        
    }
}