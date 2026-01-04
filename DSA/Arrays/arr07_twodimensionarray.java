import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr07_twodimensionarray {
    public static void main(String[] args) {
        // zag array
        // double[][] marks = new double[2][];
        // marks[0] = new double[2];
        // marks[1] = new double[4];
        // marks[0][0]=89;

        // double [][] marks = new  double[][]{
        //     {67,78},
        //     {89,67,96}
        // };
        // System.out.println(marks[0][0]);

        double [][] marks = new  double[2][];
        marks[0]=new double[2];
        marks[1]=new double[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MArks:");
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                marks[i][j]=scanner.nextDouble();
            }
        }

        // **** print ****

        // System.out.println(Arrays.deepToString(marks));

        // for(int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[i].length;j++){
        //         System.out.println(marks[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(double[] element:marks){
            System.out.println(Arrays.toString(element));
        }
        System.out.println();
    }
class Employee{
    String name;
    int empId;
    voi
}
}
