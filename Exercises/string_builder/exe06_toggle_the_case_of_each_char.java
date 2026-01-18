package string_builder;

import java.util.Scanner;

public class exe06_toggle_the_case_of_each_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
// m-1
        // for (int  i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if(ch>='A' && ch <='Z'){
        //         ch=(char) (ch+32);
        //         sb.append(ch);
        //     }
        //     else if(ch>='a' && ch <='z'){
        //         ch=(char) (ch-32);
        //         sb.append(ch);
        //     }else{
        //         sb.append(ch);
        //     }
        // }
        // System.out.println(sb.toString());

// m-2

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }   
        }
        System.out.println(sb.toString());

        scanner.close();
    }
}
