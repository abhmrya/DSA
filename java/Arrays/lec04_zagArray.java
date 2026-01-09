package Arrays;

import java.util.Scanner;

public class lec04_zagArray {
    public static void main(String[] args) {
        // int[][] myArray = new int[3][];
        // myArray[0] = new int[] {1,2,3};
        // myArray[1] = new int[] {1,2,3,4};

        // or

        int[][] myArray = new int[3][];
        myArray[0] = new int[3];
        myArray[1] = new int[2];
        myArray[2] = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enther the Element:");
        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                System.out.println("Element["+i+"]["+j+"]: ");
                myArray[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Print elements:");
        for(int i=0;i<myArray.length;i++){
            for(int j=0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }   
}
