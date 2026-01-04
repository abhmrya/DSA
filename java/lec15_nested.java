import java.util.Scanner;

public class lec15_nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = scanner.nextInt();
        System.out.println("Enter the number of column");
        int column = scanner.nextInt();
        for (int i = 1; i <=row; i++) {
            for (int j = 1; j <=column; j++) {
                System.out.print("*");                
            }
            System.out.println();
            
        }

    }
} 
