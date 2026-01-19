package string_builder;

import java.util.Scanner;

public class exe07_longest_word {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter The sentence.");
        String str = scanner.nextLine();
        int max =0;
        int count=0;
        String a ="";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch!=' '){
                count++;
                sb.append(ch);
            }
            else{
                if(count>max){
                    max=count;
                    a=sb.toString();
                    }
                count=0;
                sb.delete(0,sb.length());
            }
        }
        System.out.println(a);
        System.out.println(max);
        scanner.close();
    }
}
