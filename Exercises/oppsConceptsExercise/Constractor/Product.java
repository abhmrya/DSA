package oppsConceptsExercise.Constractor;

public class Product {
    private String productName;
    private String productID;
    private double price;
    private double discount;

    public Product(){
        this("Unknown", "Unknown",1000,10);
        // this.productName="Unknown";
        // this.productID="Unknown";
        // this.price=100;
        // this.discount=10;
        System.out.println("0 argument constractor.");
    }
    public Product(String productName,String productID){
        this(productName,productID,1000,10);
        System.out.println("2 argument constractor.");

    }
    public Product(String produName,String productID,double price,double discount){
        this.productName=produName;
        this.productID=productID;
        this.price=price;
        this.discount=discount;
        System.out.println("4 argument constractor.");
    }

    public double calculateDiscountPrice(){
        return price -(price*discount/100);
    }
    public void displayDetails(){
        System.out.println("product Name: "+this.productName);
        System.out.println("product is: "+productID);
        System.out.println("price Rs"+this.price);
        System.out.println("DIscount: "+this.discount+"%");
        System.out.println("Discounted price Rs"+this.calculateDiscountPrice());
    }
}
