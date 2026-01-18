package string_builder;

import java.util.Scanner;

public class exe04_remove_space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String str = scanner.nextLine();
// m-1
        // str = str.replace(" ","");
        // System.out.println(str);
        

// m-2
        // StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     if(str.charAt(i)!=' '){
        //         sb.append(ch);
        //     }
        // }
        // System.out.println(sb.toString());
//m-3  
        // char[] arr = str.toCharArray();
        // String result ="";
        // for(char i:arr){
        //     if(i!=' '){
        //         result+=i;
        //     }
        // }
        // System.out.println(result);
//m-4
        str = str.trim();
        System.out.println(str);


    scanner.close();
    }
}
