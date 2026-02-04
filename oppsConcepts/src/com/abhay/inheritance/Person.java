package com.abhay.inheritance;

public class Person {
    private String name;
    private String address;
    private long phoneNo;

    public Person(){
        System.out.println("this is persion constructer withour arument");
    }
    public Person(String name){
        this.name=name;
        System.out.println("Person constractor called with argument "+"name is: "+name);
    }
    public Person(String name,String address){
        this.name=name;
        this.address=address;
        System.out.println("Person constractor called with argument "+"name is: "+name+"address is: "+address);
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void greet() {
        System.out.println("hii");
    }
}
