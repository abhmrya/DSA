import java.util.Arrays;

public class RowColumnSorted {
    static int[] search(int[][] arr, int element) {
        int row = 0;
        int col = arr[0].length-1;
        while (row<=arr.length-1 && col>=0) { 
            if(arr[row][col]==element){
                return new int[] {row,col};
            }
            if(arr[row][col]>element){
                col--;
            }else{
                row++;
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 7, 11 },
                { 2, 5, 8, 12 },
                { 3, 6, 9, 16 },
                { 10, 13, 14, 17 }};
        int element = 17;
        int[] result = search(arr, element);
        System.out.println(Arrays.toString(result));
        System.out.println("This element are present in Row of : " + result[0] + " and index is : " + result[1]);
    }
}
