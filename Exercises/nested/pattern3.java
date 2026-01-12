package nested;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row.");
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(" *");
                
            }
            System.out.println();
            
        }
        scanner.close();
    }
}