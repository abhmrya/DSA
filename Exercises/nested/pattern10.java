package Exercises.nested;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(j==1 || j==i || i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
        scanner.close();
    }
    
}
