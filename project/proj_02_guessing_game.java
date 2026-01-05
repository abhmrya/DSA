package project;
import java.util.Random;
import java.util.Scanner;

public class proj_02_guessing_game {
    public static void main(String[] args) {
        // generate the random number 
        Random random = new Random();
        int secretNumber = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        // int numberOfAttempts ;
        System.out.println("\n--------------------------------");
        System.out.println("WElcome to numer guessing Game.");
        System.out.println("--------------------------------\n");
        System.out.println("Choose the difficulty level (Easy\\Medium\\Hard):");
        String difficultyLevel = scanner.next().toLowerCase();

        // if(difficultyLevel.equals("easy")){
        //     numberOfAttempts=10;
        // }
        // else if(difficultyLevel.equals("medium")){
        //     numberOfAttempts=7;
        // }else if(difficultyLevel.equals("hard")){
        //     numberOfAttempts=5;
        // }else{
        //     numberOfAttempts=-1;
        // }
        int numberOfAttempts=switch(difficultyLevel){
            case "easy"->10;
            case "medium"->7;
            case "hard"->5;
            default->{
                System.out.println("Invalid difficulty level choice.");
                yield-1;
            }
        };

        System.out.println("you have "+numberOfAttempts+" Attempts to guess the number.");
        while (numberOfAttempts>0) {
            System.out.println("Guess the number(1-100).");
            int guess = scanner.nextInt();
            if(guess<1 || guess>100){
                System.out.println("Invalid guess. Please enter a number 1 and 100.");
                continue;
            }
            if(guess==secretNumber){
                System.out.println("YOu have quessed the correct number ! you won.");
                break;
            }
            else{
                if(guess<secretNumber){
                    System.out.println("TO Low.try again..");
                }
                else{
                    System.out.println("Too High .Try again....");
                }
                numberOfAttempts--;
                System.out.println("you have "+numberOfAttempts+" Attempts to guess the number.");

            }
            if(numberOfAttempts==0){
                System.out.println("The Correct number was "+secretNumber);
            }
            
        }
        scanner.close();
    }
}

//********** my solution  **************//
// class proj_02_guessing_game {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);

//         Random rand = new Random();
//         int number = rand.nextInt(100)+1;

//         // System.out.println(number);
//         int guess=0;
//         outerloop:for(int i =5;i>=0;i--){
//             System.out.println(i+ " attempt is more availble");
//             doloop:do {
//                 System.out.println("Enter the guessing number 1 to 100.");
//                 guess = scanner.nextInt();
//                     innerloop:if (guess>=0 && guess<=100) {
//                                     if (number>guess) {
//                                     System.out.println("To Low");
//                                     continue outerloop;

//                                     }
//                                     else if(number<guess){
//                                         System.out.println("To High");
//                                         continue outerloop;
//                                     }
//                                     else{
//                                         System.out.println("correct");
//                                         break outerloop;
//                                     }
//                                 }
//                                 else{
//                                     System.out.println("Ivalid choice");
//                                     continue doloop;
//                                 }
//             } while (number!=guess);
//         }
//         System.out.println(guess);
//         System.out.println("number is:"+ number);  
//     }
// }