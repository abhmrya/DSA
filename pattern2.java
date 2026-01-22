import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j =0; j<i+1; j++) {
                System.out.print(n-j+" ");
            }
            for (int j = 0; j <2*n-2-2*i; j++) {
                System.out.print(n-i+" ");
            }
            for (int j =i; j >=1; j--) {
                System.out.print(n-j+1+" ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < n-1; i++) {
            for (int j=n; j>i+1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 0; j <2*i+1; j++) {
                System.out.print(i+2+" ");
            }
            for (int j =0; j <n-i-1; j++) {
                System.out.print(j+2+i+" ");
            }
            System.out.println(" ");
        }
        scanner.close();
    }
}
