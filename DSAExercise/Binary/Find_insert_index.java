package DSAExercise.Binary;

import java.util.Arrays;

public class Find_insert_index {
    static int[] isertindex(int[] arr,int element){
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<element){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i < low; i++) {
            newArr[i]=arr[i];
        }
        newArr[low]=element;
        for (int i = low; i<arr.length; i++) {
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,8,9};
        int element=-7;
        int[] high=isertindex(arr,element);
        System.out.println("After the insert arr: : "+Arrays.toString(high));

    }
}
