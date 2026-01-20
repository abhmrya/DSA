package com.abhay.oppsConceptsexample;

public class Dog {
    //state
    private String name;
    private int height;
    private int weight;

    // geter and seter
    public void setHeight(int h){
        if(h>5) {
            height= h;
        }
        else{
            System.out.println("Invalid height");
        }
    }
    public void setweight(int w){
        if(w>5) {
            weight = w;
        }
    }
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }


    void bark() {
        System.out.println("Barking...");
    }
    void displayDetails() {
        System.out.println("Dog Name: "+name+"\ndog Height: "+height+"\nDOg weight: "+weight);
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Charli";
        d.displayDetails();
    }
}
