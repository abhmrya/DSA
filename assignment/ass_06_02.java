// Q4. WAP to calculate product of two floating point numbers
package assignment;
import java.util.Scanner;

public class ass_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  Principle Amount ");
        int principle = scanner.nextInt();
        System.out.println("Enter thr Rate Amount");
        float rate = scanner.nextFloat();
        System.out.println("Enter the time");
        int time = scanner.nextInt();
        int simple_interast = (int)(principle*rate*time)/100;
        System.out.println("Simple Interest is:  " + simple_interast);
        scanner.close();
        
    }
}
