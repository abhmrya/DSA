package Exercises.method;

import java.util.Scanner;


public class multiplication_of_table {
    static void multiplication(int n){
        for (int i = 1; i <=10; i++) {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of table.");
        int n = scanner.nextInt();
        multiplication(n);
        scanner.close();
}
}