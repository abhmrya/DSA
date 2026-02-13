package DSAExercise.Binary;

public class UpperBound {
    static int upperBoundelement(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (low < arr.length) ? low : -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[] {2,5,7,15,15,15,22,25,58};
        int key=15;
        int result=upperBoundelement(arr, key);
        System.out.println(result);
    }
}