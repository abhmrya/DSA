package assignment;

public class ass_01_04 {
    int a = 100;
    long b = 200;
    long sum = a+b;
    void display(){
        System.out.println(sum);
    }
    public static void main(String[] args) {
        ass_01_04 obj = new ass_01_04();
        obj.display();
    } 
}

// Why error happens?
// a is int
// b is long
// When you add them (a + b), Java promotes the smaller type (int) to the bigger type (long)
// int sum = a + b;  // long → int ❌ not allowed


// Explicit cast (unsafe if result > int range):
// int sum = (int)(a + b);