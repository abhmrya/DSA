public class lec01_premitive_data {
    // float marks = 76.43;       // show error  double to float
    float marks = 76.76f;
    // float marks =(float) 76.76;   // also write you this

    // double price = 567;
    double price = 567d;  // beter this
    // double x = 1.7e308;
    double x = 0.0000000000000000000013;
    float f = 1.12345678901234f;
    double d=12345678901234567890d;
    void display(){
        System.out.println("marks " + marks);
        System.out.println("price "+ price);
        System.out.println("x= "+x);    //x= 1.3E-21
        System.out.println("f= "+f);   // 8 decimal 
        System.out.println("d "+d);    // 16 decimal
    }
}
class meter_to_feat {
    // double myHeight = 5.3d;
    float myHeight = 5.3f;
    void display(){
        double result;
        result =5.3*0.3048;
        System.out.println("heght is meters is :"+ result);
    }
}
class FloatTest {
    public static void main(String[] args) {
        lec01_premitive_data obj = new lec01_premitive_data();
        meter_to_feat obj1 = new meter_to_feat();
        obj.display();
        obj1.display();
    } 
}
