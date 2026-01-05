package Exercises.nested;

public class pattern8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7/2-i+1; j >0; j--) {
                System.out.print("  ");
            }

            for (int j = 7/2+1; j <=7; j++) {
                System.out.print("&&");
                
            }
            for (int j = 4; j <= 7-2*i+1; j++) {
                System.out.print(" H");
            }
            System.out.println();
        }
    }
}
