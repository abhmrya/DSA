package Array;

import java.util.Arrays;

class reverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]  {1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i>=0; i--) {
            arr2[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
    
}