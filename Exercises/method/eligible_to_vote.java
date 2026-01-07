package Exercises.method;

import java.util.Scanner;

public class eligible_to_vote {
    static String vote_eligible(int age){
        // if(age<18){
        //     return "No : You are not eligible for vote.";
        // }else{
        //     return "Yes : you are eligible for vote.";
        // }

        return age>=18?"Yes : you are eligible for vote." : "No : You are not eligible for vote.";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println(vote_eligible(age));
        
        scanner.close();
    }
}
