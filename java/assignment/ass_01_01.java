package assignment;

public class ass_01_01 {
    byte a =45;
    short b = 12345;
    void display(){
        int sum = a+ b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ass_01_01 obj = new ass_01_01();
        obj.display();
        
    }
}
