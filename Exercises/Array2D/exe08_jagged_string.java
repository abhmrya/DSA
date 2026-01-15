package Array2D;

import java.util.Scanner;

public class exe08_jagged_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matrix = new String[3][];
        matrix[0] = new String[2];
        matrix[1] = new String[4];
        matrix[2] = new String[3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=scanner.next();    
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");    
            }
            System.out.print("]");
            System.out.println();
        }

        scanner.close();
    }
}
