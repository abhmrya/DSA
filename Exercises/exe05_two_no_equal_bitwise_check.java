
import java.util.Scanner;

public class exe05_two_no_equal_bitwise_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number ");
        int a=scanner.nextInt();
        System.out.println("Enter a first number ");
        int b=scanner.nextInt();
        if((a^b)==0){
            System.out.println("Number are equal");
        }
        else{
            System.out.println("number are not equal");
        }
        scanner.close();
    }
}
