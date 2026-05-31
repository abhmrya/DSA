package random;

import java.util.Arrays;

public class UniquePath {

    // **********      with DP     *********
    static int helper(int start,int end,int[][] dp){
        if(start==0 && end==0) return 1;
        if(start<0 || end<0) return 0;
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        int up = helper(start-1,end,dp);
        int left = helper(start,end-1,dp);
        return dp[start][end]=up+left;
    }

    static int helper(int start,int end){
        int sum =0;
        if(start==0 && end==0) return 1;
        if(start<0 || end<0) return 0;
        sum = sum+helper(start-1,end);
        sum = sum+helper(start,end-1);
        return sum;
    }

    public static void main(String[] args) {
        int m = 20;
        int n=15;

        System.out.println("*********      Without DP     *****");
        int without = helper(m-1, n-1);
        System.out.println("unique path : "+without);


        System.out.println("**** Using DP ********");
        int[][] dp = new int[m][n];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        int unique = helper(m-1,n-1,dp);
        System.out.println("unique path : "+unique);
    }
}


