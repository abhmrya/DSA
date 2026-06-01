package Revision.Arrays;


public class ReverseArray {
    public int[] reverse(int[] arr){
        int[] newarr = new int[arr.length];
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return newarr;
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] arr = {1, 2, 3, 4, 5, 6};
        obj.reverse(arr);
        System.out.print("revser the array : ");
        for(int i : arr){
            System.out.print("  "+i);

        }
    }
}
