import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                // if(j==1||j==2*n-1||i==1||i==2*n-1){
                //     System.out.print(n+" ");
                // }
                // else{
                //     System.out.print(n-i/2+" ");
                // }

                if(j==1||j==2*n-1||i==1||i==2*n-1){
                    System.out.print(n+" ");
                }
                else if(i==j && i==n && j==n ){
                    System.out.print(n-i+1+" ");
                }
                else if(i>=j || j>=2*n-2 || i>=2 ){
                    System.out.print(n-1+" ");
                }
                // else if(i>=j+1 || j>=2*n-4 || i>=3 ){
                //     System.out.print(n-2+" ");
                // }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
