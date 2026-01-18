package string_builder;

import java.util.Scanner;

public class exe05_remove_duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(sb.toString().indexOf(ch)==-1){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        


        scanner.close();
    }
}
