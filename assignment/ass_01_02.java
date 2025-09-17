package assignment;

public class ass_01_02 {
    byte a = 45;
    short b = 12345;

    void display() {
        byte sum = (byte)(a + b);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ass_01_02 obj = new ass_01_02();
        obj.display();
    }
}
