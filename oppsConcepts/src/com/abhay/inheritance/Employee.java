package com.abhay.inheritance;

public class Employee extends Person{
    private String impId;
    private float salary;
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public String getempId() {
        return impId;
    }
}
