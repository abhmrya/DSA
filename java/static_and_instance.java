public class static_and_instance {
    // String name = "Abhay";

    // static String name = "Abhay";
    // static void greet(){
    // static_and_instance obj = new static_and_instance();
    // System.out.println("hii "+ obj.name);

        // System.out.println("hii "+ name);
    // }
    public static void main(String[] args) {
        // greet();
        // static_and_instance.greet();
        Test.greet();
        
    }
}
class Test{
    static String name = "Abhay";
    static void greet(){
        System.out.println("Hi "+name);
}
}