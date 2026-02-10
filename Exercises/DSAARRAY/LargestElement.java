package DSAARRAY;

public class LargestElement {

    static int largestelem(int[] arr){
        int highvalue=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>=highvalue){
                highvalue=arr[i];
            }
        }
        return highvalue;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,8,5,43,54,76,87,65,87,98,65,89,9,-0,3,6,7};
        int high=largestelem(arr);
        System.out.println("Highest value is : "+high);

    }
}
