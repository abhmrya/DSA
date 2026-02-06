import java.util.Arrays;

public class BidirectionalLinearSearch {
    static int FindElement(int[] arr,int element){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==element){
                return left;
            }
            else if(arr[right]==element){
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {23,43,56,76,45,93,65,43};
        int element =93;

        int result = FindElement(arr,element);
        System.out.println("Modify element is : "+Arrays.toString(arr));
        if (result==-1){
            System.out.println("element not found!");
        }else{
            System.out.println("Element index is : "+result);
        }
    }
}
