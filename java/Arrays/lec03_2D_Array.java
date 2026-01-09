package Arrays;

import java.util.Scanner;

class lec03_2D_Array {
public static void main(String[] args) {
//  t-1
    // int[][] myArray = new int[2][3];
    // myArray[0][0]=8;
    // System.out.println(myArray[0][0]);
// t-2
    // int[][] myArray = new int[][] {{1,2,3},{4,5,6}};
// t-3
    // int[][] myArray={{1,2,3},{4,5,6}};
    // System.out.println(myArray[1][2]);
// t-4
    // int[][] myArray;
    // myArray = new int[2][3];
    // myArray[0][0]=199;
    // System.out.println(myArray[0][0]);

    // int[][] myArray =  new int[][3];   //error
    // int[][] myArray =  new int[3][];   // not error

//     int[][] myArray = new int[3][];
//     myArray[0] = new int[3];
//     myArray[1] = new int[4];
//     myArray[0][0]=8;
//     System.out.println(myArray[0][1]);
// }

    int[][] myArray = new int[2][3];
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