public class lec06_Arithmetic {
    public static void main(String[] args) {
        int a = 5,b=7;
        // System.out.println(a+ -b);
        System.out.println(a>b ? a : b);  // a:b-->true:false
        System.out.println(a>b ? a*6 : b%2);  

        a =+5;
        System.out.println(a);   // 5
        a =-5;
        System.out.println(a);  // -5

        // a =*5;
        // System.out.println(a);  // error

        int c= 10;
        double d = 7.5;
        // int result = c-d; // double  (higher to lower not posible loss of data)
        // System.out.println(result);
        System.out.println(c-d);
        int e = c--;
        System.out.println(e);
        double f = ++d ;
        System.out.println(f);
    }

}
