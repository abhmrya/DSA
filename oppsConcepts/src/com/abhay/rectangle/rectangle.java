package com.abhay.rectangle;

public class rectangle {
    private int length;
    private int  breadth;
    private int area;

    public int getLength() {
        return length;
    }
    // public void setLength(int l) {
    //     length = l;
    // } 
    // public void setLength(int length) {
    //     this.length = length;
    //     return this;
    // }
    public rectangle setLength(int length) {
        this.length = length;
        return this;
    }
    public int getBreadth() {
        return breadth;
    }
    // public void setBreadth(int b) {
    //     breadth = b;
    // }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    // public rectangle setBreadth(int breadth) {
    //     this.breadth = breadth;
    //     return this;
    // }
    public int areaOfRectangle(){
        area = this.length*breadth;
        return area;
    }
    public void increaselength(int byHowMuch){
        this.length+=byHowMuch;
    }
    public void dicreasebreath(int byHowMuch){
        if(this.breadth-byHowMuch>=0){
        this.breadth-=byHowMuch;
        }
    }

    public void displayDetails(){
    System.out.println("Length: "+length);
    System.out.println("Breath: "+breadth);
    System.out.println("area of rectangle: "+areaOfRectangle());
    // show(this);
    }
    public void show(rectangle obj){
        System.out.println("Method calling using object refrence");
    }
}
