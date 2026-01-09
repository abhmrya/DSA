package Arrays;

public class lec04_zagArray2 {
    public static void main(String[] args) {
        Employeee[][] employees = new Employeee[2][3];
        employees[0][0] = new Employeee();
        employees[0][0].empName = "Abhay";
        employees[0][0].displayInfo();
        System.out.println(employees[0][0].empName);
    }
}

class Employeee{
    String empName;
    int empId;
    void displayInfo(){
        System.out.println("Name: "+empName+" EmpId: "+empId);
    }
}