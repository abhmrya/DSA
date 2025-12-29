import java.util.Scanner;

public class least_common_multiple{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int a = scanner.nextInt();
        int a1=a;
        System.out.println("Enter the secound number.");
        int b = scanner.nextInt();
        int b1=b;
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
            
        }
        System.out.println("GCD is "+a);
        System.out.println("LCM is : "+(a1*b1)/a);
    }
}