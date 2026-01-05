package Exercises.loop;

import java.util.Scanner;

public class sum_first_n_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum= sum+i;
        }    
        System.out.println("you given number of sum n number is "+ sum );
        scanner.close();
    }
}
