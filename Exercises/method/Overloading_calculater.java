package method;
public class Overloading_calculater {
    int calculate(int a,int b){
        return (a+b);
    }
    double calculate(double a,double b){
        return a*b;
    }
    double calculate(double a,double b,String c){
        switch(c){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b!=0){
                    return a/b;
                }
                else{
                    System.out.println("Division by zero not allowed");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
    public static void main(String[] args) {
        Overloading_calculater calc = new Overloading_calculater();
        System.out.println("Addition: " + calc.calculate(10, 20));
        System.out.println("Multiplication: " + calc.calculate(2.5, 4.0));
        System.out.println("Operation (+): " + calc.calculate(10, 20, "+"));
        System.out.println("Operation (*): " + calc.calculate(2.5, 4, "*"));
        System.out.println("Operation (-): " + calc.calculate(10, 20, "-"));
        System.out.println("Operation (/): " + calc.calculate(2.5, 4, "/"));
        System.out.println("Operation (/): " + calc.calculate(2.5, 0, "/"));
        System.out.println("Operation ($): " + calc.calculate(2.5, 4, "$"));
    }
}
