package DSAExercise.Binary;

import java.util.Arrays;

public class SquareSortArray {

// this aproch time complexity is more

    // static int[] sorted(int[] arr ){
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i; j < arr.length; j++) {
    //             if(arr[j]<arr[i]){
    //                 int temp=arr[i];
    //                 arr[i]=arr[j];
    //                 arr[j]=temp;
                    
    //             }
    //         }
    //     }
    //     return arr;
    // }
    // static int[] square(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i]=arr[i]*arr[i];
    //     }
    //     sorted(arr);
    //     return arr;
    // }

    static int[] square(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int[] arr1 = new int[arr.length];
        int index=arr.length-1;
        while(low<=high){

            int leftvalue = arr[low]*arr[low];
            int rightvalue = arr[high]*arr[high];

            if(leftvalue>rightvalue){
                arr1[index]=leftvalue;
                low++;
                index--;
            }else{
                arr1[index]=rightvalue;
                index--;
                high--;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-4, -1, 0, 3, 10};
        int[] result  = square(arr);
        System.out.println("Arrays is : "+ Arrays.toString(result));
    }
}
