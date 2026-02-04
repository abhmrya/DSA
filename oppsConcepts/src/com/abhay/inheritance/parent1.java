package com.abhay.inheritance;

public class parent1 extends Parent{
     public static void main(String[] args) {
        // System.out.println("parent.privateVar :"+Parent.privateVar); //error
        System.out.println("parent.defaultVar :"+Parent.defaultVar);  
        System.out.println("parent.protectedVar :"+Parent.protectedVar); 
        System.out.println("parent.publicVar :"+Parent.publicVar);
    }
}
