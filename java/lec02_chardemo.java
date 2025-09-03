public class lec02_chardemo {
    // char grade=A;    error
    // char grade='$';
    // char grade='A';
    // char grade='\u0041';
    // char grade=65;
    // char grade='\u0958';

    char grade=(char)65553;
    int x = 'A';

    char myCharMinValue = Character.MIN_VALUE;
    char myCharMaxValue = Character.MAX_VALUE;
    int a = (int)myCharMinValue;
    int b = (int)myCharMaxValue;

    void display(){
        // System.out.println("grade is:" +grade);
        // System.out.println("x= "+x);

        System.out.println(myCharMinValue);
        System.out.println(myCharMaxValue);
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        lec02_chardemo obj = new lec02_chardemo();
        obj.display();
    }
}
