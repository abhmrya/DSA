package Exercises.method;

import java.util.Scanner;

public class calculateprice {
    static double calculate(int quantity,double price,boolean ismember){
        double total =quantity*price;
        if(ismember){
            return total-(total*15)/100;
        }
        else{
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quentity");
        int quantity = scanner.nextInt();

        System.out.println("Enter the price");
        double price = scanner.nextDouble();

        System.out.println("Is member? (true/false):");
        boolean member = scanner.nextBoolean();

        double cal = calculate(quantity, price, member);
        System.out.println("Total Amount is : "+cal);
        scanner.close();
    }
    
}
