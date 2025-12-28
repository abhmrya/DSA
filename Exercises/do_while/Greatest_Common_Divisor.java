import java.util.Scanner;

public class Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("GCD = " + a);
    }
}



// public class Greatest_Common_Divisor {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int choice;
//         do {
//             System.out.println("Enter the two number number.");
//             int n = scanner.nextInt();
//             int m = scanner.nextInt();
//             int GCD = 1;
//             for(int i =1; i<Math.min(n, m);i++){
//                 if(n%i==0 && m%i==0){
//                     GCD=i;
//                 }
//             }
//             System.out.println("GCD is "+GCD);
//             System.out.println("Continue? Press 1 | Exit? Press 0");
//             choice = scanner.nextInt();
//         } while (choice==1);
//     }
// }

