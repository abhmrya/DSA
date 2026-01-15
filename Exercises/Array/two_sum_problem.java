package Array;

import java.util.Arrays;
import java.util.Scanner;

public class two_sum_problem {
    static int[] twosum(int target,int...num){
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]+num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int target;
        System.out.println("Enter the target element:");
        target=scanner.nextInt();
        System.out.println("Enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        int[] result = twosum(target,arr);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
