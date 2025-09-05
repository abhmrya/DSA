public class lec00_student{
    // rollNo       given error this is global assisgn
    int rollNo  = 22;   // attributes,instance variable(class level variavles)

    void display(){
        int a;
        a  = 2;
        System.out.println("roll no is: " + rollNo);
        System.out.println(a);
    }

    public static void main(String[] args) {
        //  System.out.println(rollNo);   //not print directly
        lec00_student obj = new lec00_student();
        System.out.println(obj.rollNo);
        obj.display();
    }

} 