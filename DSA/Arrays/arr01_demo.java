
import java.util.Scanner;

public class arr01_demo {
    // static int[] numbers;
    public static void main(String[] args) {
        // int[] number=new int[3];
        // number[0]=5;
        // number[1]=32;
        // number[2]=75;
        // System.out.println(number);
        // System.out.println(number[0]);
        // System.out.println(number[1]);
        // System.out.println(number[2]);


        // int[] numbers;
        // numbers = new int[5];
        // numbers = new int [] {1,2,3,4,5};
        // System.out.println(numbers);
        // System.out.println(numbers[0]);
        // System.out.println(numbers[1]);
        // System.out.println(numbers[2]);


        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter array element");
        for(int i=0;i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.println("Array element are: ");
        for(int i : numbers){
            System.out.println(i);
        }
        scanner.close();
    }
}