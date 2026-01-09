package Exercises.ForeachLoop;

public class bookObjectArray {
    public static void main(String[] args) {
        Bookstrore[] books = new Bookstrore[3];
        books[0] = new Bookstrore();
        books[1] = new Bookstrore();
        books[2] = new Bookstrore();

        books[0].bookName ="Avtar";
        books[0].price = 50;

        books[1].bookName ="Vidya";
        books[1].price = 100;

        books[2].bookName ="Natik";
        books[2].price = 150;

            int totalprice=0;
        for(Bookstrore i:books){
            System.out.println("book name is: "+i.bookName);
            System.out.println("book price is: "+i.price);
            totalprice=totalprice+i.price;
        }
        System.out.println("****************************");
        System.out.println("Total price is :"+totalprice);
        System.out.println("Average price is :"+totalprice/books.length);
        System.out.println("****************************");
    }
}

class Bookstrore {
    String bookName;
    int price;
}