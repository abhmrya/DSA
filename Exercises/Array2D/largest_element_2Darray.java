package Array2D;

import java.util.Scanner;

public  class largest_element_2Darray {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=scanner.nextInt();
            }
        }
        int maxvalue =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>maxvalue){
                    maxvalue=array[i][j];
                }
            }
        }
        System.out.println("Max value is: "+maxvalue);
        scanner.close();
    }
}
