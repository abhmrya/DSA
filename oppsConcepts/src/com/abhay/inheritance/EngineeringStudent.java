package com.abhay.inheritance;

public class EngineeringStudent extends Student{
    private byte courceduration;

    public EngineeringStudent() {
        System.out.println("Engineering constructor called.");
    }

    public byte getCourceduration() {
        return courceduration;
    }

    public void setCource(byte courceduration){
        this.courceduration=courceduration;
    }
    
}
