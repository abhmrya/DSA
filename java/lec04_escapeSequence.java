public class lec04_escapeSequence {
    public static void main(String[] args) {
        String str = "Hello \n Welcome";
        System.out.println(str);
        System.out.println("hello\nwelcome to \njenny's Lecture!");
        System.out.println("Name:\tAbhay\nAge:\t20");
        System.out.println("My name is 'Abhay'");    
        System.out.println("My name is \"Abhay\"");    
        char ch = 'A';
        System.out.println(ch);
        char chh = '\'';
        System.out.println(chh);
        System.out.println("Hello Abhay's");
        System.out.println("my java path is: c:\\program files\\java");
        System.out.println("abhhyy\b\bs");
        System.out.println("Hello\rWelcome");
        System.out.println("Hello Welcome\r hi");
        System.out.println("page1 \fpage2");
        System.out.println("Happy new year!"+"\u083C\uDF86");
        // System.out.println("! said\, \"No Piracy\"");  //! said\ → here \ is unnecessary, it will just cause an error.
    }
}  
