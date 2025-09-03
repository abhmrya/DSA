public class lec03_booleandata {
    // boolean isjavaEasy = true;
    boolean isjavaEasy;    // default false

    int a=5,b=6;
    boolean result=(a>b);
    void display(){
        System.out.println("Is java easy: "+isjavaEasy);
        System.out.println("result is "+ result);
    }
    public static void main(String[] args) {
        lec03_booleandata obj = new lec03_booleandata();
        obj.display();
    }
}
