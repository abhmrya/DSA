package com.abhay.inheritance;

public class Student extends Person {
    private short rollNo;
    private String course;

    public Student(){
        System.out.println("Student constructor called.");
    }

    public short getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String cource) {
        this.course = cource;
    }
    // public void greet(){
    //     System.out.println("radhe radhe");
    // }
}
