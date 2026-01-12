package loop;

import java.util.Scanner;
// 11.	WAP to count digits in a number.
public class digit_count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = scanner.nextInt();
        int count = 0;
        System.out.println("number is : "+n);
        if(n==0){
            System.out.println("Count is : "+count );
        }
        else{
            while(n!=0){
                n= n/10;
                count++;
            }
            System.out.print("count is :" + count);
            }
            scanner.close();
    }
}
