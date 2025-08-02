
class SayHello {
    public void say() {
        System.out.println("hello world");
    }
    public void Swap(){
        int a=5;
        int b=4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}

public class hello {
    public static void main(String args[]) {
        SayHello obj = new SayHello();
        obj.say();
        obj.Swap();
    }
}
