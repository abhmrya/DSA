package Exercises.nested;

public class pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i <=4; i++) {
            for (int j = 1; j <i+1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <9-2*i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
