package Exercises.method;

import java.util.Scanner;

public class area_circumfrence {
    static double pi = Math.PI;

    static double circumference(double radius){
        double circumfrence = 2*pi*radius;
        return circumfrence;
    }

    static double  area(double radius){

        double area = pi*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the circle radius.");
        double radius =  scanner.nextInt();
        System.out.println("circle Area is: "+area(radius));
        System.out.println("Circle Circumfrence is : "+circumference(radius));

        scanner.close();
    }
}
