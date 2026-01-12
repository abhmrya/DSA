package Array2D;

import java.util.Scanner;

public class exe04_transpose {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(" [");
            for (int j = 0; j <array.length; j++) {
                System.out.print(array[j][i]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        scanner.close();
    }
}
