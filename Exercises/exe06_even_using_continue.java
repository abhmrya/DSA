package Exercises;

import java.util.Scanner;

public class exe06_even_using_continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        // even number
        for(int i =1;i<=n;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }

        //  odd number
        // for(int i =1;i<=n;i++){
        //     if(i%2==0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        scanner.close();
    }
}
