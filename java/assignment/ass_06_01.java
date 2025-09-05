// Q1 WAP to take input form user as length and breadth and calculate area of Rectangle.  
// 	Area of rectangle= Length * Breadth

package assignment;
import java.util.Scanner;

public class ass_06_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectangle is: " + area);

        scanner.close();
    }
}