package Exercises.nested;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Enter the number.");
    int n= scanner.nextInt();
    for (int i =1; i<=n; i++) {
        for (int j =1; j<=i-1; j++) {
        System.out.print(" ");
        }
        int a= n;
        for (int j = 1; j <=2*n+1-i; j++) {
            if (j%2==0) {
                System.out.print(" ");
            }
            else{
                System.out.print(a+"");
            }

        }
        a--;
        
        System.out.println();
    }
    scanner.close();
    }
    
}
