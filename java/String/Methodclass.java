package String;

public class Methodclass {
    public static void main(String[] args) {
        // String str = "abhay kush";
        // System.out.println(str.length());
        // System.out.println(str.isEmpty());

        // String str2 = " ";
        // System.out.println(str2.length());
        // System.out.println(str2.isEmpty());  // fase
        // System.out.println(str2.isBlank());  // true

        // String str3 ="\n";
        // System.out.println(str3.length());  //1
        // System.out.println(str3.isEmpty());    // false
        // System.out.println(str3.isBlank());   // true

        // String str = "abhay kush";
        // String str2 = null;
        // String str3 = new String("abhay kush");
        // System.out.println(str2.equals(str));  //compile error
        // System.out.println(str.equals(str2)); //false
        // System.out.println(str.equals(str3)); //true
        // System.out.println(str==str3);        // false
        // String str3 = new String("Abhay Kush");
        // System.out.println(str.equalsIgnoreCase(str3)); //ture
        // System.out.println(str.compareTo(str3));  // 32
        // System.out.println(str3.compareTo(str));  // -32

        // String str = "apple";
        // String str2 = "banana";
        // System.out.println(str.compareTo(str2));  //  -1
        // System.out.println(str2.compareTo(str));   //  1

        // System.out.println("abhay".compareTo("abh"));  //2
        // System.out.println("abh".compareTo("abhay"));  //-2
        // System.out.println("kendhrie".compareTo("zfeidmdw"));  //-15
        // System.out.println("".compareTo("abhay"));  //-5
        // System.out.println("abhay".compareTo(""));  //5

        String str = "abhay kush";
        System.out.println(str.endsWith("kush"));  //true
        System.out.println(str.endsWith("sh"));   // true
        System.out.println(str.charAt(4));
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Character at index "+i+" is "+str.charAt(i));
        }


    }
}
