package DSAExercise.Binary;

public class MedianOfSortedArray {
    static float median(int[] arr){
        if(arr.length%2==0){
            int mid=(arr.length-1)/2;
            return (arr[mid]+arr[mid+1])/2.0f;
        }
        else{
             int mid=arr.length/2;
            return arr[mid];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,6,8,9};
        float result = median(arr);
        if(result>=0){
            System.out.println("Median is : "+result);
        }else{
            System.out.println("Invalid Numbers.");
        }
    }
}
