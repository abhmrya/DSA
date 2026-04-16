package DSA.Recursion;

import java.util.Scanner;

public class Fibonnanchi {
    static int fibo(int x){
        if(x<=1) return x;
        return fibo(x-1)+fibo(x-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = fibo(num);
        System.out.println("Fibonacci: " + result);

        scanner.close();
    }
}
