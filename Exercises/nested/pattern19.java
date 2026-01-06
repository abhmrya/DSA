package Exercises.nested;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Enter the number.");
    int n= scanner.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
        }
        for (int j = 1; j <=2*n-2*i; j++) {
            System.out.print("  ");
            
        }
        for (int j =i; j >=1; j--) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
    scanner.close();
    }
}
