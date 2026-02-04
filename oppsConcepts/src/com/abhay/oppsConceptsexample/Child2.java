package com.abhay.oppsConceptsexample;


import com.abhay.inheritance.Parent;

public class Child2 {
    public static void main(String[] args) {
        // System.out.println("parent.privateVar :"+Parent.privateVar); //error
        // System.out.println("parent.defaultVar :"+Parent.defaultVar);  //error
        // System.out.println("parent.protectedVar :"+Parent.protectedVar);  //error
        System.out.println("parent.publicVar :"+Parent.publicVar);
        // System.out.println("child1.proctedVar"+child1.protectedVar);  //error
    }
}
