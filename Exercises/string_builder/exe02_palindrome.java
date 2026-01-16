package string_builder;

import java.util.Scanner;

public class exe02_palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("check string is palindeome or not:");
        String str= scanner.nextLine();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = str.length()-1; i >=0; i--) {
            sb.append(str.charAt(i));
        }
        // System.out.println(sb);
        // str.toString();
        if (str.equals(sb.toString())) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        scanner.close();
    }
}
