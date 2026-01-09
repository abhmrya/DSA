package Arrays;

class lec02_ForeachLoop {
    public static void main(String[] args) {

        // String[] names = {"Abhay","Payal","Rahul"};
        // System.out.println(names[0]);

        // Employee obj  = new Employee();
        // obj.empname="Abhay";
        // obj.salary = 4354535.654;
        // obj.display();

        // Employee obj1  = new Employee();
        // obj1.empname="Kush";
        // obj1.salary = 4354535.654;
        // obj1.display();

        // Store in array

        Employee[] employees  = new Employee[3];
        // Employee[] employees = new Employee[] {new Employee(),new Employee(),new Employee()};
        // System.out.println(employees);
        // System.out.println(employees[0]);
        employees[0]=new Employee();
        employees[0].empname="abhay";
        System.out.println(employees[0].empname);
        System.out.println(employees[0].salary);

        employees[1]=new Employee();
        employees[1].empname="Abhay";
        employees[1].salary=87.08;
        System.out.println(employees[1].empname);
        System.out.println(employees[1].salary);
    }
}
class Employee {
    String empname;
    double salary;

    void display(){
        System.out.println("Emplyee name "+ empname+" "+"Employee Salary "+salary);
    }
}