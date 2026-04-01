package random;


public class add {
    public static void main(String[] args) {
        int a =100;
        int b=101;
        while(b!=0){
            int carry = a&b;
            a = a^b;
            b = carry<<1;
        }
        System.out.println("sum : "+a);
    }
}
