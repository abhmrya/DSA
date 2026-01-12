package Array2D;

import java.util.Scanner;

public class matrix_multiply {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] multiply = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // input of matrix
        System.out.println("Enter the element of 1st matrix.");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter the element of 2st matrix.");
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[i].length;j++){
                matrix2[i][j]=scanner.nextInt();
            }
        }
        //multiply matrix
        int a =0;
        int b=0;
        System.out.println("Multiply matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a=0;
                a = matrix[i][j];
            } 
        }
        for (int i = 0; i < matrix2[0].length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                b=0;
                b = matrix2[i][j];
                multiply[i][j]=a*b;
            } 
        }

        scanner.close();
    }
}
 