public class lec19_method_overloading {
    // static void print(int a){
    //     System.out.println("Printing integer value: " + a);
    // }
    // static void print(double a){
    //     System.out.println("Printing double value: "+a);
    // }
    // static void print(String a){
    //     System.out.println("Printing String value: "+a);
    // }
    // void add(int a,int b){
    //     System.out.println(a+b);
    // }
    // //int add(int a,int b){
    // //     return a+b;
    // // }
    // int add(int a,int b,int c){
    //     return a+b;
    // }

    // type promotion
    double add(int a,double b){
        return a+b;
    }
    double add(double a,int b){
        return a+b;
    }
    // void add(short a,short b){
    //     System.out.println(a+b);
    // }

    int id;
    static void display(String name){
        System.out.println(name);
    }
    static void display(lec19_method_overloading obj1){
        System.out.println(obj1.id);
    }
    public static void main(String[] args) {
        lec19_method_overloading obj = new lec19_method_overloading();
        obj.id=10;
        // display(null);
        display(obj);

        // print(5);
        // print("Jenny");
        // print(7.6);
    //     add(2,3);
    //     int result = add(2,3,4);
    //     System.out.println(result);
    // }

    
    //     System.out.println(obj.add(2,3.2));
    //     double result = obj.add(2.2,3);
    //     System.out.println(result);

    // byte b1=10,b2=20;
    // obj.add(b1,b2);

    // obj.add(1,1.9);
    // obj.add(3.3, 3);
    }
}