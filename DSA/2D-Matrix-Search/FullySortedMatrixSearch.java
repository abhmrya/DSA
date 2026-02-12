import java.util.Arrays;

public class FullySortedMatrixSearch {
    static int BinarySearch(int[] arr, int element) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == element) {
                return mid;
            }
            if (arr[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int[] search(int[][] arr, int element) {
        int lowRow = 0;
        int highRow = arr.length - 1;
        while (lowRow <= highRow) {
            int mid = lowRow + (highRow - lowRow) / 2;
            if (arr[mid][0] <= element && arr[mid][arr[mid].length - 1] >= element) {
                int index = BinarySearch(arr[mid], element);
                return new int[] { mid, index };
            }
            if (arr[mid][0] > element) {
                highRow = mid - 1;
            } else {
                lowRow = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 5, 7 },
                { 9, 11, 13, 15 },
                { 17, 19, 21, 23 },
                { 25, 27, 29, 31 }
        };
        int element = 31;
        int[] result = search(arr, element);
        System.out.println(Arrays.toString(result));
        System.out.println("This element are present in Row of : " + result[0] + " and index is : " + result[1]);
    }
}
