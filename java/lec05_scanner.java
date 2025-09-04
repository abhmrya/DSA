import java.io.IOException;
import java.util.Scanner;

public class lec05_scanner {
    public static void main(String[] args) throws IOException {
        // System.out.println("Hello Abhay ");
        // int x = System.in.read();
        // System.out.println(x-48);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("your name is "+name);
    }
}
