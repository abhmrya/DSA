package Exercises.loop;

import java.util.Scanner;

public class sum_even_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                sum= sum+i;
            }
            
        }    
        System.out.println("sum of even number " + n +" is  "+ sum );
    }
}
