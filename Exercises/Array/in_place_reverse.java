package Array;

import java.util.Arrays;

public class in_place_reverse {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        int length = arr.length-1;
        int left=0;
        int right=length;
        while (left<right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
