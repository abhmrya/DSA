
import java.util.Scanner;

public class arr07_twodimensionarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // zag array
        double[][] marks = new double[2][];
        marks[0] = new double[2];
        marks[1] = new double[4];
        // marks[0][0]=89;

        // double [][] marks = new  double[][]{
        //     {67,78},
        //     {89,67,96}
        // };
        // System.out.println(marks[0][0]);

        // double [][] marks = new  double[2][];
        // marks[0]=new double[2];
        // marks[1]=new double[4];
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter MArks:");
        // for(int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[i].length;j++){
        //         marks[i][j]=scanner.nextDouble();
        //     }
        // }

        // **** print ****

        // System.out.println(Arrays.deepToString(marks));

        // for(int i=0;i<marks.length;i++){
        //     for(int j=0;j<marks[i].length;j++){
        //         System.out.println(marks[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(double[] element:marks){
        //     System.out.println(Arrays.toString(element));
        // }
        // System.out.println();

        // Employee[][] employees = new Employee[2][3];
        // employees[0][0] = new Employee();
        // employees[0][0].name = "jenny";
        // employees[0][0].empId = 32;
        // System.out.println(employees[0][0].name);
        // System.out.println(employees[0][0].empId);
        // System.out.println(employees.length);
        // Employee employee = new Employee();
        // employee.name ="abhay";
        // employee.empId = 213;
        // employee.Display();

        Employee[][] employee = new Employee[2][];
        employee[0]= new Employee[1];
        employee[1] = new Employee[2];
        employee[0][0] = new Employee();
        employee[1][0] = new Employee();
        employee[1][1] =new Employee();
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Enter"+(i+1)+" employee details:");
            for (int j = 0; j < employee[1].length; j++) {
                employee[i][j].name = scanner.next();
                employee[i][j].empId = scanner.nextInt();
            }   
        }
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Enter"+(i+1)+" employee details:");
            for (int j = 0; j < employee[1].length; j++) {
                System.out.println(employee[i][j].name+" ");
                System.out.println(employee[i][j].empId+" ");
            }   
            System.out.println();
        }
        scanner.close();
    }
}
class Employee{
    String name;
    int empId;
    void Display(){
        System.out.println("Name: "+name+" emp id: "+empId);
    }
}