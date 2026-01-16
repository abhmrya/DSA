package string_builder;

import java.util.Scanner;

public class exe03_count_vowels {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("check how many vowels and consonants");
    String str = scanner.nextLine().toLowerCase();
    int vowels =0;
    int consonants=0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
            vowels++;
        }else consonants++;
    }
    System.out.println("vowels is :"+vowels);
    System.out.println("consonants is:"+consonants);

    scanner.close();
    }

}
