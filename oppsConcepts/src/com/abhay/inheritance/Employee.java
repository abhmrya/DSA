package com.abhay.inheritance;

public class Employee extends Person{
    private String name;
    private String impId;
    private float salary;

    // public  Employee(){
    //    // super();   //this()
    //     System.out.println("Emoloye constarictor is called");
    // }
    // public Employee(String name){
    //     this.name = name;
    // }

    public Employee(String name,String impId){
        super(name);
        
        this.impId=impId;
        System.out.println("EMployee constructer with 2 argument called. "+name+" "+impId);
    }

    public Employee(String name,String address,String impId){
        super(name,address);
        this.name=name;
        this.impId=impId;
        System.out.println("EMployee constructer with 3 argument called. "+name+" "+impId);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public String getempId() {
        return impId;
    }

    // public String toString(){
    //     return "name :"+getName()+"\naddress"+getAddress()+"\nempId"+impId;
    // }

    public String toString(){
        return "name :"+name+"\naddress"+getAddress()+"\nempId"+impId;
    }
}
