package Array2D;

import java.util.Scanner;

public class sum_of_all_element {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // input of matrix
        System.out.println("Enter the element.");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }

        //sum of matrix
        int sum =0;
        System.out.println("Matrix sum is: ");
        for(int[] row:matrix){
            for(int i:row){
                sum=sum+i;
            }
        }
        System.out.println("sum is: "+sum);



        scanner.close();
    }
}
