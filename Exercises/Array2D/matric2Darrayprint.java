package Exercises.Array2D;

import java.util.Scanner;

public class matric2Darrayprint {
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

        //print of matrix
        System.out.println("Matrix is: ");
        for(int[] row:matrix){
            System.out.print("[ ");
            for(int i:row){
                System.out.print(i+" ");
            }
            System.out.print("]");
            System.out.println();
        }



        scanner.close();
    }
}
