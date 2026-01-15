package Array2D;

import java.util.Scanner;

public class exe07_sum_row_individual {
    public static void main(String[] args) {
        int[][] matrix= new int[3][];
        matrix[0]=new int[3];
        matrix[1]=new int[2];
        matrix[2]=new int[5];
    
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j]=scanner.nextInt();
        }
    }
    int count=0;
    for (int[] i : matrix) {
        for (int j : i) {
            count+=j;
        }
    }
    System.out.print("X,Y,Z has elements: "+count);

    scanner.close();
    }
    
}