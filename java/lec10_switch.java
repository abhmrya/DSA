import java.util.Scanner;

public class lec10_switch {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of 1 t 0 7 of day");
        choice= scanner.nextInt();
        switch(choice){
            case 1:System.out.println("monday");
                break;
            case 2:System.out.println("tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thusday");
                break;
            case 5:System.out.println("Friday");
                break;
            case 6:System.out.println("Saturday");
                break;
            case 7:System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}
