import java.util.Scanner;

public class lec16_method {
    static int addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter secound number:");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is: "+sum);
        scanner.close();
        return sum;
    }
    public static void main(String[] args) {

        int a = addition();
        System.out.println(a);
        // addition();
        // addition();
    
    }
}
