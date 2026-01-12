package method;
import java.util.Scanner;


public class greeting_message {
    static void greeting(String name,String timeofday){
        if(timeofday.equalsIgnoreCase("morning")){
            System.out.println("Hii "+name + " Good Gorning");
        }
        else if(timeofday.equalsIgnoreCase("Afternoon")){
            System.out.println("Hii "+name + " Good afternoon");
        }
        else if(timeofday.equalsIgnoreCase("night")){
            System.out.println("Hii "+name + " Good Night");
        }
        else{
            System.out.println("hii "+name);
        }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the you name.");
        String name = scanner.next();
        System.out.println("Enter the time of day");
        String timeofday = scanner.next();
        greeting(name,timeofday);
        // System.out.println();
        
        
        scanner.close();
        
    }
}
