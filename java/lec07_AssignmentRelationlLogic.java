public class lec07_AssignmentRelationlLogic {
    static int a;
    public static void main(String[] args) {
        int a=8;
        // int b=a;
        int b=a+3*6;
        // 7=a;    error
        int  c=b=a;
        System.out.println(b);
        System.out.println("a= "+a+" b= "+b+" c= "+c);   //a= 8 b= 8 c= 8
        String str1="abhay",str2="abhay";
        System.out.println(str1==str2);   // true
        String str3=new String("abhay");
        String str4=new String("abhay");
        System.out.println(str3==str4);  //false

    }
}
