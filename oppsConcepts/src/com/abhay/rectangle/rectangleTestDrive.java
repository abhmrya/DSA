package com.abhay.rectangle;

public class rectangleTestDrive {
   public static void main(String[] args) {
    rectangle obj = new rectangle();
    rectangle obj1 = new rectangle();
    // obj.setBreadth(3);
    // obj.setLength(5).setBreadth(5).displayDetails();;
    // obj.displayDetails();
    // System.out.println("Length: "+obj.getBreadth());
    // System.out.println("Breath: "+obj.getLength());
    // System.out.println(obj.areaOfRectangle());

    obj.setLength(3);
    obj.setBreadth(5);
    obj.displayDetails();
    // int newLengthobj= obj.getLength();
    // newLengthobj+=10;
    // obj.setLength(newLengthobj);
    // obj.displayDetails();
    obj.increaselength(10);
    obj.dicreasebreath(2);
    obj.displayDetails();

    obj1.setLength(10);
    obj1.setBreadth(50);
    obj1.increaselength(20);
    obj1.dicreasebreath(20);
    obj1.displayDetails();
    // int newLengthobj1=obj1.getLength();
    // newLengthobj1+=20;
    // obj1.setLength(newLengthobj1);
    // obj1.displayDetails();

   }
}