package oppsConceptsExercise.classes_objects;

public class Circle {
    private double radius;

    public void setradius(double radius){
        if(radius<0){
            this.radius=1;
        }else{
        this.radius=radius;
        }
    }
    public double getArea(){
        return radius*Math.PI*radius;
    }
    public double getCirecomference(){
        return 2*Math.PI*radius;
    }
}
