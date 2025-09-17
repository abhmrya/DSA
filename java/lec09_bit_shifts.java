public class lec09_bit_shifts {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a<<1);
        System.out.println(a<<2);
        System.out.println(a<<3);
        System.out.println(a>>1);
        System.out.println(a>>2);
        System.out.println(a>>3); //  10/4
        System.out.println(a>>>2);

        int b=-10;
        System.out.println(b>>>1);
        System.out.println(b>>1);

        int c =1;
        System.out.println(c<<31);
        System.out.println(c>>2);

        long d=1;
        System.out.println(d<<62);
        System.out.println(d<<64);
        System.out.println(d>>>31);
    }
}
