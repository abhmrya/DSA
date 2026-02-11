package DSAExercise.Binary;

public class Peak_element {
    static int findpeak(int[] nums){
        int low = 0;
        int high = nums.length-1;
        int mid=0;
        while (low<=high) {
            mid = low+(high-low)/2;
            if(nums[mid]>nums[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return nums[mid];
    }
    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 6,8,9,1,2};
        int result = findpeak(arr);
        System.out.println("Peak element is: " + result);
    }
}
