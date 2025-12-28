import java.util.Scanner;

public class password_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Correct Password.");
        String correct_password= scanner.nextLine();
        String password;
        do {
            System.out.println("Enter The password.");
            password= scanner.nextLine();
            if (correct_password.equals(password)) {
                System.out.println("correct password.");
            }
            else{
                System.out.println("invalid password!");
            }


        } while (!correct_password.equals(password));
        System.out.println("Access Granted");
    }
}
