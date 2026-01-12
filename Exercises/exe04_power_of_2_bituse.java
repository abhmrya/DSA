
import java.util.Scanner;

public class exe04_power_of_2_bituse {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        System.out.println(num);
        if ((num & num-1)==0){
            System.out.println("Yes number of power of 2");
        }
        else{
            System.out.println("Number is not power of 2");
        }
        scanner.close();
    }
}
