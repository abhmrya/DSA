package Revision.Arrays;


public class Max_Min {

    public void maxmin(int[] arr){
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min : "+min + "      max  : "+max);
    }
    
    public static void main(String[] args) {
        Max_Min obj = new Max_Min();
        int[] arr = {3,5,1,9,2,8};
        obj.maxmin(arr);
    }
}
