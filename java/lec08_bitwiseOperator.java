public class lec08_bitwiseOperator {
    public static void main(String[] args) {
        // int a=10,b=6;
        // int result=a&b;   
        // int result=a|b;    
        // System.out.println(result); 
        // System.out.println("a & b "+ (a & b));  //2
        // System.out.println("a | b "+ (a | b));  //14
        // System.out.println("a ^ b "+ (a ^ b));   //12

        // int a=10,b=20,c=30,d=40;
        // if((a<b) | (++c<d))   // (),++ ,<,|
        // {
        //     System.out.println("inside if");
        // }
        // System.out.println("c="+c);  //31

        // int a=70,b=20,c=30,d=40;
        //  if((a<b) & (++c<d))   // (),++ ,<,|
        // {
        //     System.out.println("inside if");
        // }
        // System.out.println("c="+c);  //31

        // int a=70,b=20,c=30,d=40;
        //  if((a<b) && (++c<d))   // (),++ ,<,|
        // {
        //     System.out.println("inside if");
        // }
        // System.out.println("c="+c);  //30



        int a=10;
        System.out.println(~a);
        char ch1='A',ch2='B';   // \u0041--> 0000 0100 0001->65
        System.out.println("ch1 & ch2 = "+(ch1&ch2));
        System.out.println("ch1 | ch2 = "+(ch1|ch2));
        System.out.println("ch1 ^ ch2 = "+(ch1^ch2));
        System.out.println('a'-'A');
        System.out.println(a-0);
        System.out.println('A'-0);
    }
}
