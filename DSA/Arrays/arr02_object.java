package DSA.Arrays;

class Student{
    String name;
    int age;

    void display(){
        System.out.println("name is : "+name + " age is : "+ age);
    }
    
}
public class arr02_object {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student();
        student[0].name = "Abhay";
        student[0].age = 20;
        System.out.println(student[0].name);
        System.out.println(student[0].age);
        // System.out.println(student[1].name);
        // System.out.println(student[1].age);

        student[1] = new Student();
        // student[1].name = "Abhay kushwaha";
        // student[1].age = 22;
        System.out.println(student[1].name);
        System.out.println(student[1].age);

        student[0].display();
        student[1].display();
        // student[2].display();
        }
        
        
}
