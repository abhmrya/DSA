public class IntegerDemo {
    // byte rollNo = 22;  // 8 bits
    short jeerank =32323;
    int rollNo=988323302;       // 32 bits
    long PhoneNo=1239688888899979754L;
    // int age=23L;

    int minValue=Integer.MIN_VALUE;
    int MaxValue = Integer.MAX_VALUE;
    int a=MaxValue+99999;
    //int b=2147483648; ---->error


    void display(){
        
        System.out.println("roll no is " + rollNo);
        System.out.println("min value of int is : "+ minValue);
        System.out.println("Max value of int is " + MaxValue);
        System.out.println("a = " + a);
        //System.out.println("b="+b);
    }
 
    public static void main(String[] args) {
        IntegerDemo obj = new IntegerDemo();
        System.out.println(obj.rollNo);
        obj.display();
    }
}
