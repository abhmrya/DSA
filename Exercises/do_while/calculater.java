import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a simple calculater.");
        int choice=0;
        do{
            System.out.println("Enter your choice.");
            System.out.println("1. Add two number.");
            System.out.println("2. subtraact two number.");
            System.out.println("3. Multiply two number");
            System.out.println("4. Subtract two number");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the two number.");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Addition is: "+(a+b));
                    break;
                case 2:
                    System.out.println("Enter the two number.");
                    a = scanner.nextInt();
                    b = scanner.nextInt();                   
                    System.out.println("substraction is:"+(a-b));
                    break;
                case 3:
                    System.out.println("Enter the two number.");
                    a = scanner.nextInt();
                    b = scanner.nextInt();                   
                    System.out.println("multiplication is: "+(a*b));
                    break;
                case 4:
                    System.out.println("Enter the two number.");
                    a = scanner.nextInt();
                    b = scanner.nextInt();                   
                    if(b==0){
                        System.out.println("divition is not difin");
                        break;
                    }
                    else{
                        System.out.println("divition is "+(a/b));
                        break;
                    }
                case 5:
                    System.out.println("Thank You!");
                    break;
                    
                default:
                    System.out.println("Invalid choce.");  
                    break;  
            }
            
        } while (choice!=5);
        scanner.close();
    }
}
