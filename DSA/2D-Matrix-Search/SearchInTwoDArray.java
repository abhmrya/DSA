import java.util.Arrays;

public class SearchInTwoDArray {
    static int[] SearchIndexRow(int[][] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 45, 26, 17 }, { 24, -54, 77, 14 }, { 12, 23, 4, 45 }, { 99, 28, 66, 4 } };
        int element = 24;
        int[] result = SearchIndexRow(arr, element);
        System.out.println(Arrays.toString(result));
        System.out.println("This element are present in Row of : " + result[0] + " and index is : " + result[1]);

    }
}