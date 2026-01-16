package String;

public class Stringpool {
    public static void main(String[] args) {
        // String str1 = "jenny";
        // String str2 = "jenny";
        // String str3 = new String("jenny").intern();
        // System.out.println(str1==str2);
        // System.out.println(str1==str3);

        // System.out.println(str1=="jen"+"ny"); //jenny
        // final String str4="ny";
        // System.out.println(str1=="jen"+str4);   //true

        // String str4="ny";
        // System.out.println(str1=="jen"+str4);  // false

// same no. given 
        // System.out.println(System.identityHashCode(str1));
        // System.out.println(System.identityHashCode(str2));
        // System.out.println(System.identityHashCode(str3));

// 3rd diffrent no. given beause intern remove
        String str1 = "jenny";
        String str2 = "jenny";
        String str3 = new String("jenny");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
    }
}
