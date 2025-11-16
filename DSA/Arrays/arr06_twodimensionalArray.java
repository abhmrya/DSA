import java.util.Scanner;

public class arr06_twodimensionalArray {
    public static void main(String[] args) {
        // double [][] marks;
        // marks = new double[2][3];

        // double [][] marks= new double[2][3];
        // marks[0][0]=99;
        // marks[0][1]=94;
        // marks[0][2]=96;

        // double [][] marks= new double[][] {{78,89,90},{56,78,67}};

        double [][] marks= new double[2][3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MArks");
        for(int i = 0; i< 2;i++){
            for(int j=0;j<3;j++){
                marks[i][j]=scanner.nextDouble();
            }
        }

        for(int i = 0; i< 2;i++){
            for(int j=0;j<3;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(marks[0][1]);
        System.out.println(marks[1][1]);

    }
}
