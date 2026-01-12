package String;

// import java.util.Arrays;
   
public class demo {
    //  static String str;
    public static void main(String[] args) {
        // demo s = new demo();
        // System.out.println(s.str);

        // String str;
        // System.out.println(str); // given error

        // String str="Abhay";
        // System.out.println(str);
        // String str1="Abhay kushwaha 1234343 $#34t3gbg4";
        // System.out.println(str1);

        // String str2 = new String();
        // System.out.println(str2); ///why print blank line

        // int[] arr = new int[] {1,2,3,4,5,6,7};
        // System.out.println(arr);  // but this print addresh
        // System.out.println(Arrays.toString(arr));

        String str = "abhay";
        String str1 = "abhay";
        String str2 = new String("abhay");  // new obj diffrent addresh 
        String str3 = new String("abhay");
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str3==str2);
    }
}
