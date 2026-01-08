public class lec18_parameter_passing {  // class is a user defined data type
    // static void updateVAriavale(int a){  // before a =20  /  after a = 10
    //     a =10; // a=10
    // }

    int num;
    static void updateVAriavale(lec18_parameter_passing obj){
        obj.num=10;
    }
    static void updateVAriavale1(lec18_parameter_passing obj1){
        obj1 = new lec18_parameter_passing();
        obj1.num = 10;
    }

    static void updateVAriavale2(lec18_parameter_passing obj1){
        obj1.num = 50;
        obj1 = new lec18_parameter_passing();
        obj1.num = 10;
    }

    static  void display(String name){
        name = "Kush";
        // System.out.println(name);
    }
    public static void main(String[] args) {

        String myName = "abhay";
        String herName = myName;
        display(herName);
        System.out.println(myName);
        System.out.println(herName);


        // lec18_parameter_passing obj = new lec18_parameter_passing();  // creating the object
        // obj.num =20;
        // updateVAriavale(obj); // peimatives.object reference
        // System.out.println(obj.num);

        // updateVAriavale1(obj); // peimatives.object reference
        // System.out.println(obj.num);

        // updateVAriavale2(obj); // peimatives.object reference
        // System.out.println(obj.num);

        // int nums =20;
        // updateVAriavale(nums);
        // System.out.println(nums);
        
    }
}
