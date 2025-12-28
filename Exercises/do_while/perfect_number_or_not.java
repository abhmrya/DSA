import java.util.Scanner;

public class perfect_number_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            int perfect_number = 0;
            System.out.println("Enter the number.");
            n = scanner.nextInt();
            for(int i=1;i<=n/2;i++){
                if(n%i==0){
                    perfect_number+=i;
                }
            }
            if(n==perfect_number){
                System.out.println("This number is perfect number.");
            }
            else{
                System.out.println("This number is not perfect numbe.");
            }
        } while (n!=0);
    }
}
