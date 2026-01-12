package nested;
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt(); 
        for (int i = 1; i <=n/2+1; i++) {
            for (int j = 1; j <=n/2; j++) {
                if(j>=i){
                    System.out.print(" ");
                } 
            }
            for (int j = 1; j <=2*i-1; j++) {
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }    
        scanner.close();   
    }
    
}
