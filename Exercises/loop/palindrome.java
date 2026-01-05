package Exercises.loop;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word or number.");
        String str  = scanner.nextLine();
        int n = str.length();
        String rev="";
        for(int i = n-1 ; i >=0 ; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equel");
        }
        scanner.close();
    }
}