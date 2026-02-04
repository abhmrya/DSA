package com.abhay.oppsConceptsexample;

import com.abhay.inheritance.Parent;

public class Child1 extends Parent{
    public static void main(String[] args) {
        // System.out.println("parent.privateVar :"+Parent.privateVar); //error
        // System.out.println("parent.defaultVar :"+Parent.defaultVar);  //error
        System.out.println("parent.protectedVar :"+Parent.protectedVar);
        System.out.println("parent.publicVar :"+Parent.publicVar);
        System.out.println("");

    }
}
