public class lec17_static_and_instance {
    // String name = "Abhay";

    static String name = "Abhay";
    static int empId = 101;
    static void greet(){
    // static_and_instance obj = new static_and_instance();
    // System.out.println("hii "+ obj.name);

        System.out.println("hii "+ name +" greet");
    }

    static void display(){
        greet();
        System.out.println("Your emp Id is : "+ empId);

    }

    // USe of static methods
    static int square(int number){
        return number*number;
    }

    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static String toupper(String str){
        return str.toUpperCase();
    }

    // Bank's Exchange Rate USD to EUR
      String empname;
      int empId1;

    void setInfo(String name,int id){
        empname = name;
        empId1 =id;
      }
    void getInfo(){
        greet();
        System.out.println("Hi "+empname);
        System.out.println("Your emp id is: "+ empId1);
    }
    void updateName(String name){
        empname = name;
    }
    public static void main(String[] args) {
        // greet();
        // static_and_instance.greet();
        // Test.greet();
        // display();
        // System.out.println(square(5));
        // System.out.println(reverse("abhay"));
        // System.out.println(toupper("abhay"));

        lec17_static_and_instance obj = new lec17_static_and_instance();
        obj.setInfo("abhay",101);
        obj.getInfo();
        obj.updateName("payal");
        obj.getInfo();
        // obj.setInfo("Kush",102);
        // obj.getInfo();
    }
    
}
// class Test{
//     static String name = "Abhay";
//     static void greet(){
//         System.out.println("Hi "+name);
// }
// }