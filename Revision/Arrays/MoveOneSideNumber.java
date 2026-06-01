package Revision.Arrays;

// bugs in this code 

public class MoveOneSideNumber {
    public int[] move(int[] arr){
        int low=0;
        int  high= 1;
        while(high!=arr.length-1){
            if(arr[low]<0 && arr[high]>0){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
            }
            high++;
            System.out.println("low : "+arr[low] +"   high : "+arr[high]);
        }
        return arr;
    }

    public static void main(String[] args) {
        MoveOneSideNumber obj = new MoveOneSideNumber();
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] result = obj.move(arr);
        System.out.print("Move All Negative Numbers to One Side: ");
        for(int i : result){
            System.out.print("  "+i);

        }
    }
}
