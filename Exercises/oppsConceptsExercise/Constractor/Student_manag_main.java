package oppsConceptsExercise.Constractor;

public class Student_manag_main {

    public static void main(String[] args) {

        student_managment s1 = new student_managment("abhay","abhay23",(short) 1,89.90f,"gurgaon",98L);

        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
    }
}
