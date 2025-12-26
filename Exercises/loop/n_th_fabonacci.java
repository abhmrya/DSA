package Exercises.loop;

import java.util.Scanner;

public class n_th_fabonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n th fabonacci.");
        int n = scanner.nextInt();
        int a =0;
        int b= 1;

        
        if (n == 0) {
            System.out.println("Nth fibonacci number is: 0");
        } 
        else if (n == 1) {
            System.out.println("Nth fibonacci number is: 1");
        }
        else{
        for(int i=2;i<=n;i++){
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println("nth fabonacci number is: "+b);
    }
    }
}
