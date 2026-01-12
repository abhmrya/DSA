package loop;
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your table number: ");
        int n = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+ " X "+ i+ " = " + n*i);
        }
        scanner.close();
    }
}
