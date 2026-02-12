import java.util.Arrays;

// Row wise sorted

public class SortedTwoDMAtrixSearch {
    static int BinarySearch(int[] arr,int element){
        int low =0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(arr[mid] > element){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    static int[] SearchIndexRow(int[][] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][0]<=element && arr[i][arr[i].length - 1]>=element){
                // for (int j = 0; j < arr[i].length; j++) {
                    // if (arr[i][j] == element) {
                    //     return new int[] { i, j };
                    // }
                // }
                int result = BinarySearch(arr[i], element);
                if(result>=0){
                    return new int[] {i,result};
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 15, 26, 27 }, { 24, 34, 37, 44 }, { 12, 23, 44, 45 }, { 1, 2, 73, 74 } };
        int element = 73;
        int[] result = SearchIndexRow(arr, element);
        System.out.println(Arrays.toString(result));
        System.out.println("This element are present in Row of : " + result[0] + " and index is : " + result[1]);

    }
}
