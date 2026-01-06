package Exercises.nested;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Enter the number.");
    int n= scanner.nextInt();
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=2*i-1; j++) {
            if (j%2!=0) {
                System.out.print(i+"");
            }
            else{
                System.out.print(" ");
            }
        }
        
        System.out.println();
    }
    scanner.close();
    }
}
