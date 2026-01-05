package Exercises.nested;

public class pattern5 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {

            
            for (int j =7/2; j >=7/2-i+1 ; j--) {
                System.out.print("*");
            }
            // for (int j = 7; j >=4-i; j--) {
            //     System.out.print(" *");
            // }
            System.out.println();
        }
    }
}
