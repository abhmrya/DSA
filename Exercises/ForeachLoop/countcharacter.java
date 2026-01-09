package Exercises.ForeachLoop;
// how many times a specific character appears in a given character array
public class countcharacter {
    public static void main(String[] args) {
        // char[] letter = new char[]{'k','f','y','s','u'};
        char[] letter = {'k','f','a','y','s','u','a','a','y','s','u','a','a','y','s','u','a'};
        char target ='a';
        int count =0;
        for(char ch:letter){
            if(ch==target){
                count++;
            }
        }
        System.out.println(count);

    }
}
