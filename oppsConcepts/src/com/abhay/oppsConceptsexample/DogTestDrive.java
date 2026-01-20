package com.abhay.oppsConceptsexample;

public class DogTestDrive {
    public static void main(String[] args) {
         Dog bulldog = new Dog();
        Dog greybulldog = new Dog();

         bulldog.setHeight(-32);
         bulldog.setweight(34);
         System.out.println(bulldog.getHeight());
         System.out.println(bulldog.getWeight());
         System.out.println(greybulldog.getHeight());
//        bulldog.name="charlie";
//        bulldog.height=38;
//        bulldog.weight=30;
//
//        bulldog.bark();
//        bulldog.height=-30;
    }
}
