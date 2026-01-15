package Array2D;

import java.util.Scanner;

public class exe06_count_print_jagged {
    public static void main(String[] args) {
        int[][] matrix= new int[3][];
        matrix[0]=new int[3];
        matrix[1]=new int[2];
        matrix[2]=new int[4];
    
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j]=scanner.nextInt();
        }
    }
    int row = 0;
for (int[] i : matrix) {
        int count=0;
    for (int j : i) {
        count++;
    }
    System.out.print("Row " + row++ + " has elements: "+count);
    System.out.println();
}

    scanner.close();
    }
}
