import java.util.Scanner;

public class total_no_divisior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        int count=0;
        int i=1;
        while(n>=i){
                if(n%i==0){
                    count+=1;
                }
                i++;
        }
        System.out.println("Total number of divisior is: "+count);
        scanner.close();
    }
}
