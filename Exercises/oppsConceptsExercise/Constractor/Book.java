package oppsConceptsExercise.Constractor;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){
        this("Unknown", "Unknown");
        // this.title="XYX";
        // this.author = "i dont Know";
        // this.price = 100;
        System.out.println("No argument.");
    }
    public Book(String title,String author){
        this(title,author,250);
        // this.title = title;
        // this.author =author;
        System.out.println("2 argument called constructer.");
    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author = author;
        this.price = price;
        System.out.println("3 argument called constracter");
    }

    void displayDetails(){
        System.out.println("Book title: " + title);
        System.out.println("book Author: "+this.author);
        System.out.println("Book price : "+this.price);
    }
}
