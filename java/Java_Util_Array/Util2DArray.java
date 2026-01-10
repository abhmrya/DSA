package Java_Util_Array;

import java.util.Arrays;

public class Util2DArray {
    public static void main(String[] args) {
        int[][] myTwoDArray = {{2,4},{4,5}};
        // System.out.println(myTwoDArray);
        System.out.println(Arrays.toString(myTwoDArray));  // given the addresh not value
        System.out.println(Arrays.deepToString(myTwoDArray));
        
    }
}
