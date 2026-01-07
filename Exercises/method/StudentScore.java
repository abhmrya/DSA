package Exercises.method;

import java.util.Scanner;

public class StudentScore {

    static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    static void displayStudentGrade(String name, int score) {
        String grade = calculateGrade(score);
        System.out.println(name + " got grade " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Enter your score:");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else {
            displayStudentGrade(name, score);
        }

        scanner.close();
    }
}
