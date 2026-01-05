package Exercises.loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = scanner.nextInt();
        int factorial = 1;
        if(n==0){
            n=1;
        }
        else{
        for (int i=1;i<=n;i++){
            factorial = factorial*i;
        } 
        scanner.close();
    }   
        System.out.println("you given number n  is factorial value is: "+ factorial );
    }
}
