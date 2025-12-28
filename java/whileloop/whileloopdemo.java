package whileloop;

import java.util.Scanner;

public class whileloopdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // int i=1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }

        // int i=1;
        // while(true){   
        //     if (i==10) {
        //         break;
        //     }
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 1;
        // do{
        //     System.out.println(i); //  1
        //     i++;
        // }while(i>10);

        
        int n;
        do{
            System.out.println("Enter a number between 1 to 50: ");
            n = sc.nextInt();
            if(n<1 || n>50 ){
                System.out.println("Invalid nummber");
            }
        }while(n>50 || n<1);
            System.out.println("You entered "+ n + "and thid is a valid number!");
        
    }
}