package Exercises.nested;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = n-i+1; j >1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" *");
            }
            System.out.println();
            
        }
        scanner.close();
    }
    
}
