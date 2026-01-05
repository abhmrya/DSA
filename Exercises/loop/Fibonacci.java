package Exercises.loop;
//	WAP to check if a number is prime or not.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number :");
        int n = scanner.nextInt();
        int a = 0;
        int b=1;
        System.out.print("fabbonaci: 0 1 ");
        for(int i=1;i<=n;i++){
                int c=a+b;
                System.out.print(c+" ");
                a = b;
                b = c;
        }
        scanner.close();
    }
}