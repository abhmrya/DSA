package project;

import java.util.Scanner;

public class proj_01_coffee_shop {
    public static void main(String[] args) {
        System.out.println("**************************");
        System.out.println("\u263A Welcome to Coffe cafe! \u2615");
        System.out.println("**************************");
        System.out.println("choose your coffee");
        System.out.println("1. Espresso  - 200Rs");
        System.out.println("2. cappuccino - 250 Rs.");
        System.out.println("3. Latte - 300Rs.");
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double bill=0;
        if(choice==1){
            bill = 200;
        }else if (choice==2){
            bill = 250;
        }
        else if(choice==3){
            bill=300;
        }
        else{
            System.out.println("Invalid choice!");
        }

        if (bill>0){
            System.out.println("Add whipped Cream for 30Rs?(yes=1/no=0)");
            int WhippedCreamChoice = scanner.nextInt();
            if(WhippedCreamChoice==1){
                bill+=30;
            }
            
            System.out.println("Add a flaver shot?(vanilla for 20Rs or Hazelnut for 30)(yes=1/no=0)");
            int flaver=scanner.nextInt();
            if(flaver==1){
                System.out.println("Which one? Enter 1 for vanilla 2 for Hazelnut");
                int flaverchoice = scanner.nextInt();
                if(flaverchoice==1){
                    bill+=20;
                }
                else if (flaverchoice==2){
                    bill+=30;
                }
            }
            System.out.println("total bill is "+bill);
        }
        
    }
}
