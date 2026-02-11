package DSAExercise.Binary;

public class LowerBound {

    static int lowerBound(int[] arr, int x){
        int low =0;
        int high = arr.length-1;
        if(x>arr[arr.length-1]){
            return -1;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;       }
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,7,15,15,17,22,25,50};
        int key = 15;
        int result = lowerBound(arr,key);
        System.out.println("lower bound index of "+key+" is "+result);
    }
}
