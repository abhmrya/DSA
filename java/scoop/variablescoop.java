package scoop;
public class variablescoop {
    static int a = 10;
    int b;
    void display(){
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
    public static void main(String[] args) {
        variablescoop obj = new variablescoop();
        variablescoop obj2 = new variablescoop();

        obj.b=45;
        obj2.b = 67;
        // variablescoop.a=20;
        obj.a=20;
        obj2.a=30;
 
        obj.display();
        obj2.display();
    }
}
