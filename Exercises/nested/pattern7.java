package Exercises.nested;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        for (int i = 0; i <=n/2; i++) {
            for (int j = 1; j <i+1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <n-2*i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
