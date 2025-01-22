class Product {
    private static int productCounter = 100;
    //static variable
    static double discount = 5.0;
	
	//final variable
    private final int productID;
	
	//instance variable
    private String productName;
    private double price;
    private int quantity;


    //constructor
    public Product(String productName, double price, int quantity) {
        this.productID = productCounter++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
	//updateDiscount method
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
   
    //display product details
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + calculateFinalPrice());
        } else {
            System.out.println("This object is not an instance of Product.");
        }
    }
    
	//after updated discount final price
    public double calculateFinalPrice() {
        return price - (price * discount / 100);
    }
}

class ShoppingCartSystem {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 800.0, 2);
        Product product2 = new Product("Headphones", 100.0, 5);
        
        System.out.println("Before discount update:");
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();
        
        Product.updateDiscount(15.0);
        
        System.out.println("\nAfter discount update:");
        product1.displayDetails();
        System.out.println();
        product2.displayDetails();
    }
}
