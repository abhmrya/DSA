package Exercises;

public class exe02_swap_without_arithmatic {
    public static void main(String[] args) {
        int a=430;
        int b= 20;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
        
    }
}
