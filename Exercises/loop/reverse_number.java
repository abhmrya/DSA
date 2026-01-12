package loop;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        int reverse=0;
        while (n!=0) {
            int a=n%10;
            reverse = reverse*10+a;
            n=n/10;
        }
        System.out.println("reverse number is- "+reverse);
        scanner.close();
    }
}