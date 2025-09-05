import java.io.IOException;
import java.util.Scanner;

public class lec05_scanner {
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello Abhay ");
        // int x = System.in.read();
        // System.out.println(x-48);
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = scanner.next();
        // System.out.println("Enter your last name");
        // String last_name = scanner.next();
        // System.out.println("your name is "+name + last_name);


        // String name = scanner.nextLine();
        // System.out.println("your name is "+name);

        // System.out.println("Enter First Number");
        // int num1 = scanner.nextInt();
        // System.out.println("Enter secound Number");
        // int num2 = scanner.nextInt();
        // int sum = num1+num2;
        // System.out.println("sum is "+sum);

        // System.out.println("Enter First Number");
        // float num3 = scanner.nextFloat();
        // System.out.println("Enter secound Number");
        // float num4 = scanner.nextFloat();
        // float summ = num3+num4;
        // System.out.println("sum is "+summ);

        System.out.println("Enter First Number");
        byte num5 = scanner.nextByte();
        System.out.println("Enter secound Number");
        byte num6 = scanner.nextByte();
        // byte summm =num5+num6;      // int default
        byte summm = (byte)(num5+num6);
        System.out.println("sum is "+summm);

        scanner.close();

    }
}
