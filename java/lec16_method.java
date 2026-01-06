
public class lec16_method {
// t-1
    // static int addition(){
        // Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter first number:");
    //     int num1 = scanner.nextInt();
    //     System.out.println("Enter secound number:");
    //     int num2 = scanner.nextInt();
    //     int sum = num1+num2;
    //     // System.out.println("The sum is: "+sum);
    //     scanner.close();
    //     return sum;
    // }
// t-2
    //with return type and with argument
    // static int addition(int a,int b){
    //     int sum = a+b;
    //     return sum;
    // }
// t-3
    //     //without return type and with argument
    // static void addition(int a,int b){
    //     int sum = a+b;
    //     System.out.println("sum is : "+sum);
    // }
// t-4
        //without return type and with argument
    // static void addition(int a,double b){
    //     double sum = a+b;
    //     System.out.println("sum is : "+sum);
    // }

    static String greetMessage(){
        boolean isMorning=true;
        if(!isMorning){
            return "good morning";
        }
        else{
            return "Hare Krishna";
        }
    }
    public static void main(String[] args) {
        String result = greetMessage();
        System.out.println(result);
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter first number:");
        // int a = scanner.nextInt();
        // System.out.println("Enter secound number:");
        // int b = scanner.nextInt();
// t-2
        // int result = addition(a,b);
        // System.out.println("The sum is:"+result);
// t-3
        // addition(a,b);
// t-4
        // addition((int) 7.7f,9);
// t-1
        // addition();
        // addition();
        // scanner.close();
    
    }
}
