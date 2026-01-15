package Array2D;

import java.util.Scanner;

public class matrix_multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first matrix element 3X3");
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j]=scanner.nextInt();
            }  
        }

        System.out.println("Enter the second matrix element 3X3");
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j]=scanner.nextInt();
            }  
        }

//***********  multiply matrix *********
        int[][] matrix3 = new int[3][3];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                int multiplymatric=0;
                for (int k = 0; k < matrix3.length; k++) {
                    multiplymatric=multiplymatric+matrix1[i][k]*matrix2[k][j];
                }
                matrix3[i][j]=multiplymatric;
            }
        }

// ****** print matrix  *****
        for (int i = 0; i < matrix3.length; i++) {
            System.out.print(" [");
            for (int j = 0; j < matrix3.length; j++) { 
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.print(" ]");
            System.out.println();
            
        }


        scanner.close();
    }
}
 