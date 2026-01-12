package method;
import java.util.Scanner;

public class check_prime {
    static String primecheck(int n){
        if(n<=1){
            return "this number is not check_prime.";
        }
        else if(n==2){
            return "This number is prime.";
        }
        for (int i = 2; i <Math.sqrt(n)+1; i++) {
            if(n%i==0 ){
                return "This number is not prime.";
            }
        }
        return "This number is prime";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        String a = primecheck(n);
        System.out.println(a);
        scanner.close();
    }
}
